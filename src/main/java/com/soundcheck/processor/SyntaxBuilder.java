package com.soundcheck.processor;

import com.soundcheck.syntax.Syntax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

@Service
public class SyntaxBuilder {
    @Autowired
    private ReadFile reader;

    @Autowired
    private Parser parser;

    @Autowired
    private CheckSyntax checkSyntax;

    @Autowired
    private Transformation transformation;

    @Autowired
    private Flusher flusher;

    @Autowired
    private RegisterSyntax registerSyntax;

    @Autowired
    private Syntax syntax;

    public Syntax buildSyntax(String filePath, String low,
                            String high, String outFileName, String start) {
        try {
            String content = reader.readFile(filePath);
            syntax =  parser.parse(content, start);

            Map<String, Distribution> derivations = syntax.getDerivations();

            checkSyntax.checkBeforeTransformation(content, derivations);
            transform(low, high);

            registerSyntax.register(syntax, outFileName, filePath);
            checkSyntax.checkAfterTransformation(syntax.getDerivations(), start);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        return syntax;
    }

    private void transform(String low, String high) {
        transformation.setSyntax(syntax);
        transformation.transform(low, high);
        Set<String> flushSet = transformation.getFlushSet();
        syntax = transformation.getSyntax();
        syntax.setDerivations(flusher.flush(syntax.getDerivations(), flushSet));
    }
}
