package com.soundcheck.player.builders;

import com.soundcheck.syntax.Syntax;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BuildSequence {
    List<String> getSequence(
            Syntax syntax,
            String start,
            int numNotes
    );
}
