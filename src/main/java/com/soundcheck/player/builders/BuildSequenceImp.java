package com.soundcheck.player.builders;

import com.soundcheck.player.Sargam;
import com.soundcheck.player.transformers.DigitsToNotes;
import com.soundcheck.processor.Distribution;
import com.soundcheck.syntax.Syntax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;

@Component
public class BuildSequenceImp implements BuildSequence {

    @Autowired
    private DigitsToNotes digitsToNotes;

    public DigitsToNotes getDigitsToNotes() {
        return digitsToNotes;
    }

    public void setDigitsToNotes(DigitsToNotes digitsToNotes) {
        this.digitsToNotes = digitsToNotes;
    }

    @Override
    public List<String> getSequence(Syntax syntax, String start,
                                    int numNotes) {

        List<String> seq = new ArrayList<>();
        Map<String, Distribution> derivations = syntax.getDerivations();
        Map<String, Distribution> schemes = syntax.getSchemes();

        Stack<String> choices = new Stack<>();
        choices.push(start);
        int count = 0;

        System.out.println(start);

        while(count != numNotes) {
            if(choices.isEmpty()) {
                System.out.println(String.format("Stack got empty. So reinitializing with \"%s\" variable.", start));
                choices.push(start);
                continue;
            }

            String currChoice = choices.pop();

            if(Sargam.swar.containsKey(currChoice)) {
                seq.add(currChoice);
                ++count;
                continue;
            }

            if(currChoice.contains("(")) {
                String[] parts = currChoice.split("\\(");
                String schemeName = parts[0];
                String swar = parts[1].substring(0, parts[1].length() - 1);

//                String digits = (String) schemes.get(schemeName).sample();
                List<String> notes = digitsToNotes.transform(
                        (String) schemes.get(schemeName).sample(),
                        swar, syntax.getAscent(),
                        syntax.getDescent()
                );

                for(int i = notes.size() - 1; i >= 0; --i) {
                    choices.push(notes.get(i));
                }

                continue;
            }

            Distribution<String> distribution = derivations.get(currChoice);
            String der = distribution.sample();

            String[] ids = der.split("-");

            for(int i = ids.length - 1; i >= 0; i--) {
                choices.push(ids[i]);
            }
        }

        return seq;
    }
}
