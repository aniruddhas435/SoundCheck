package com.soundcheck.processor;

import com.soundcheck.generated.RaagLexer;
import com.soundcheck.generated.RaagParser;
import com.soundcheck.listeners.RaagCustomListener;
import com.soundcheck.player.Sargam;
import com.soundcheck.syntax.Syntax;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Parser {

    @Autowired
    private Syntax syntax;

    public Syntax getSyntax() {
        return syntax;
    }

    public void setSyntax(Syntax syntax) {
        this.syntax = syntax;
    }

    public static RaagParser createParser(String content) {
        RaagLexer lexer = new RaagLexer(CharStreams.fromString(content));
        RaagParser parser = new RaagParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        return parser;
    }

    public static String getStringForSyntax(Map<String, Distribution> derivations, String start) {
        String res = "";
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        Set<String> visited = new HashSet<>();
        visited.add(start);

        while(!queue.isEmpty()) {
            String variable = queue.remove();
            Distribution<String> distribution = derivations.get(variable);
            String expression = variable + " -> " + distribution;
            res += expression + ";\n";

            for(String derivation: distribution.getValues()) {
                for(String str: derivation.split("-")) {
                    if(!Sargam.swar.containsKey(str) && !visited.contains(str) && !str.contains("(")) {
                        queue.add(str);
                        visited.add(str);
                    }
                }
            }
        }

        return res;
    }

    public Syntax parse(String content, String start) {
        RaagParser parser = createParser(content);
        RaagCustomListener listener = new RaagCustomListener();
        parser.addParseListener(listener);
        parser.syntax();

        List<String> ascent = listener.getAscent();
        List<String> descent = listener.getDescent();
        Map<String, Distribution> schemes = listener.getSchemes();
        Map<String, Distribution> derivations = listener.getDerivations();

        syntax.setAscent(ascent);
        syntax.setDescent(descent);
        syntax.setSchemes(schemes);
        syntax.setDerivations(derivations);
        syntax.setStart(start);

        return syntax;
    }
}