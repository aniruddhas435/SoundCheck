package com.soundcheck.processor;

import com.soundcheck.declarations.Declarations;
import com.soundcheck.syntax.Syntax;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private Declarations declarations;

    public Object[] buildSyntax(String filePath) {
        try {
            String content = reader.readFile(filePath);
            Object[] parsed =  parser.parse(content);

            syntax = (Syntax) parsed[0];
            declarations = (Declarations) parsed[1];

            System.out.println(declarations);

            String low = declarations.getLow();
            String high = declarations.getHigh();
            String outFileName = declarations.getOutFileName();
            String start = declarations.getStart();

            Map<String, Distribution> derivations = syntax.getDerivations();

            checkSyntax.checkBeforeTransformation(content, derivations);
            transform(low, high);

            registerSyntax.register(syntax, declarations, outFileName, filePath);
            checkSyntax.checkAfterTransformation(syntax.getDerivations(), start);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        return new Object[]{syntax, declarations};
    }

    private void transform(String low, String high) {
        transformation.setSyntax(syntax);
        transformation.transform(low, high);
        Set<String> flushSet = transformation.getFlushSet();
        syntax = transformation.getSyntax();
        syntax.setDerivations(flusher.flush(syntax.getDerivations(), flushSet));
    }
}