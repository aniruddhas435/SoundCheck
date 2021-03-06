package com.soundcheck.processor;

import com.soundcheck.declarations.Declarations;
import com.soundcheck.generated.RaagLexer;
import com.soundcheck.generated.RaagParser;
import com.soundcheck.listeners.RaagCustomListener;
import com.soundcheck.listeners.RaagErrorListener;
import com.soundcheck.player.Sargam;
import com.soundcheck.syntax.Syntax;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.*;

public class Parser {

    private Syntax syntax = new Syntax();

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

    public static String getStringForSyntax(Map<String, Distribution> derivations) {
        String res = "";

        for(Map.Entry<String, Distribution> entry: derivations.entrySet()) {
            res += entry.getKey() + " -> " + entry.getValue().toString() + ";\n";
        }

        return res;
    }

    public static String getStringForSyntax(Map<String, Distribution> derivations, String start) {
        String res = "";
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        Set<String> visited = new HashSet<>();
        visited.add(start);

        while(!queue.isEmpty()) {
            String variable = queue.remove();
            if(!derivations.containsKey(variable)) {
                continue;
            }
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

    public Object[] parse(String content) {
        RaagParser parser = createParser(content);
        RaagCustomListener listener = new RaagCustomListener();
        RaagErrorListener errorListener = new RaagErrorListener();
        parser.addErrorListener(errorListener);
        parser.addParseListener(listener);
        parser.syntax();

        List<String> ascent = listener.getAscent();
        List<String> descent = listener.getDescent();
        Map<String, Distribution> schemes = listener.getSchemes();
        Map<String, Distribution> derivations = listener.getDerivations();
        Declarations declarations = listener.getDeclarations();

        syntax.setAscent(ascent);
        syntax.setDescent(descent);
        syntax.setSchemes(schemes);
        syntax.setDerivations(derivations);
        syntax.setStart(declarations.getStart());

        return new Object[]{syntax, declarations};
    }
}
