package com.soundcheck.processor;

import com.soundcheck.generated.RaagParser;
import com.soundcheck.listeners.CheckDerivationsListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CheckSyntax {
    @Autowired
    private CheckDerivationsListener listener;

    public void checkBeforeTransformation(String content, Map<String, Distribution> derivations) {
        RaagParser parser = Parser.createParser(content);
        listener.setDerivations(derivations);
        parser.addParseListener(listener);
        parser.syntax();
    }

    public void checkAfterTransformation(Map<String, Distribution> derivations, String content) {
        RaagParser parser = Parser.createParser(content);
        listener.setDerivations(derivations);
        parser.addParseListener(listener);
        parser.syntax();
    }
}
