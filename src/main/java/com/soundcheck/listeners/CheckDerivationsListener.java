package com.soundcheck.listeners;

import com.soundcheck.processor.Distribution;
import com.soundcheck.player.Sargam;
import org.antlr.v4.runtime.Token;
import org.springframework.stereotype.Component;
import com.soundcheck.generated.RaagBaseListener;
import com.soundcheck.generated.RaagParser;

import java.util.Map;

@Component
public class CheckDerivationsListener extends RaagBaseListener {
    private Map<String, Distribution> derivations;

    public Map<String, Distribution> getDerivations() {
        return derivations;
    }

    public void setDerivations(Map<String, Distribution> derivations) {
        this.derivations = derivations;
    }

    @Override
    public void exitOption(RaagParser.OptionContext ctx) {
        String option = ctx.getText();
        boolean isSwar = Sargam.swar.containsKey(option);
        boolean isDerivationPresent = derivations.containsKey(option);
        boolean stepUp = option.contains("*") && derivations.containsKey(option.substring(0, option.length() - 1));
        boolean stepDown = option.contains("_") && derivations.containsKey(option.substring(0, option.length() - 1));
        boolean isPalta = option.contains("(");

        if(!(isSwar || isDerivationPresent || stepUp || stepDown || isPalta)) {
            Token token = ctx.getStart();
            int line = token.getLine();
            int charPos = token.getCharPositionInLine();
            String msg = "variable " + ctx.getText() + " has no derivation";

            System.err.println("line " + line + ":" + charPos + " " + msg);
            System.exit(-1);
        }
    }
}
