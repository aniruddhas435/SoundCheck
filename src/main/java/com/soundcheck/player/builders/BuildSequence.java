package com.soundcheck.player.builders;

import com.soundcheck.syntax.Syntax;

import java.util.List;

public interface BuildSequence {
    String getWhatHappens();
    List<String> getSequence(
            Syntax syntax,
            String start,
            int numNotes
    );
}
