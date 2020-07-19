package com.soundcheck.player.transformers;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SchemeToSequence {
    List<String> getSequenceFromSimpleScheme(
            String scheme, String swar,
            List<String> ascent,
            List<String> descent
    );
}
