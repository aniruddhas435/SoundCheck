package com.soundcheck.player.transformers;

import com.soundcheck.player.transformers.comb2seq.CombinatorToSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DigitsToNotesImp implements DigitsToNotes {
    @Autowired
    private SchemeToSequence schemeToSequence;
    @Autowired
    @Qualifier("normal")
    private CombinatorToSequence combinatorToSequence;

    public SchemeToSequence getSchemeToSequence() {
        return schemeToSequence;
    }

    public void setSchemeToSequence(SchemeToSequence schemeToSequence) {
        this.schemeToSequence = schemeToSequence;
    }

    public CombinatorToSequence getCombinatorToSequence() {
        return combinatorToSequence;
    }

    public void setCombinatorToSequence(CombinatorToSequence combinatorToSequence) {
        this.combinatorToSequence = combinatorToSequence;
    }

    @Override
    public List<String> transform(String scheme, String swar,
                          List<String> ascent,
                          List<String> descent) {

        if(scheme.contains("(")) {
            scheme = scheme.substring(1, scheme.length() - 1)
                           .replace(" ", "");
            String[] strs = scheme.split(",");
            String notes = strs[0];
            int sampleSize = Integer.parseInt(strs[1]);

            scheme = combinatorToSequence.getSimpleSchemeFromCombinator(notes, sampleSize);
        }

        return schemeToSequence.getSequenceFromSimpleScheme(scheme, swar, ascent, descent);
    }
}
