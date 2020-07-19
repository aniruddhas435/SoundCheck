package com.soundcheck.player.transformers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DigitsToNotes {
    public List<String> transform(String digits,
                          String swar,
                          List<String> ascent,
                          List<String> descent);
}
