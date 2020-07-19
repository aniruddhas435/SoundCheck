package com.soundcheck.player.transformers;

import org.springframework.stereotype.Component;

@Component
public interface CombinatorToSequence {
    public String getSimpleSchemeFromCombinator(
            String notes,
            int sampleSize
    );
}
