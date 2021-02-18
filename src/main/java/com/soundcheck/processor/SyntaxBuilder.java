package com.soundcheck.processor;

import com.soundcheck.declarations.Declarations;
import com.soundcheck.listeners.error.ErrorHandler;
import com.soundcheck.syntax.Syntax;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class SyntaxBuilder {

    private ReadFile reader = new ReadFile();
    private Parser parser = new Parser();
    private CheckSyntax checkSyntax = new CheckSyntax();
    private Transformation transformation = new Transformation();
    private Flusher flusher = new Flusher();
    private RegisterSyntax registerSyntax = new RegisterSyntax();
    private Syntax syntax = new Syntax();
    private Declarations declarations = new Declarations();

    public Object[] buildSyntax(String filePath) {
        try {
            String content = reader.readFile(filePath);
            Object[] objects = buildSyntax(content, filePath);
            syntax = (Syntax) objects[0];
            declarations = (Declarations) objects[1];
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        return new Object[]{syntax, declarations};
    }

    public Object[] buildSyntax(String content, String filePath) throws IOException {
        Object[] parsed =  parser.parse(content);
        if(ErrorHandler.hasErrorOccured) {
            return new Object[]{};
        }

        syntax = (Syntax) parsed[0];
        declarations = (Declarations) parsed[1];

//        System.out.println(declarations);
        System.out.println(Parser.getStringForSyntax(syntax.getDerivations(), "Start"));
        System.out.println("=======================================================================================================");

        String low = declarations.getLow();
        String high = declarations.getHigh();
        String outFileName = declarations.getOutFileName();
        String start = declarations.getStart();

        Map<String, Distribution> derivations = syntax.getDerivations();

        checkSyntax.check(content, derivations);
        transform(low, high);

        System.out.println(Parser.getStringForSyntax(syntax.getDerivations()));
        System.out.println("=======================================================================================================");

        if(ErrorHandler.hasErrorOccured) {
            return new Object[]{};
        }

        if(filePath != null) registerSyntax.register(syntax, declarations, outFileName, filePath);
        checkSyntax.check(content, derivations);

        if(ErrorHandler.hasErrorOccured) {
            return new Object[]{};
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