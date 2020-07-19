package com.soundcheck.player.transformers;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DigitsToNotes {
    public List<String> transform(String digits,
                          String swar,
                          List<String> ascent,
                          List<String> descent);
}
