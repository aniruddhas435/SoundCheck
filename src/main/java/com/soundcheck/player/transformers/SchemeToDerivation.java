package com.soundcheck.player.transformers;

import com.soundcheck.processor.Distribution;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SchemeToDerivation {
    public Distribution<String> transform(
            Distribution<String> schemeDist,
            String swar,
            List<String> ascent,
            List<String> descent
    );
}
