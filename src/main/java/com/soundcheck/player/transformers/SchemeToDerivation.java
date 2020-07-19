package com.soundcheck.player.transformers;

import com.soundcheck.processor.Distribution;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SchemeToDerivation {
    public Distribution<String> transform(
            Distribution<String> schemeDist,
            String swar,
            List<String> ascent,
            List<String> descent
    );
}
