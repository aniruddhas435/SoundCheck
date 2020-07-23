package com.soundcheck.player.transformers.comb2seq;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface CombinatorToSequence {
    public String getSimpleSchemeFromCombinator(
            String notes,
            int sampleSize
    );
}
