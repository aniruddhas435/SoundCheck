package com.soundcheck.processor;

import com.soundcheck.generated.RaagParser;
import com.soundcheck.listeners.CheckDerivationsListener;

import java.util.Map;

public class CheckSyntax {
    private CheckDerivationsListener listener = new CheckDerivationsListener();

    public void check(String content, Map<String, Distribution> derivations) {
        RaagParser parser = Parser.createParser(content);
        listener.setDerivations(derivations);
        parser.addParseListener(listener);
        parser.syntax();
    }
}
