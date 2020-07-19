package com.soundcheck.player.builders;

import com.soundcheck.syntax.Syntax;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BuildSequence {
    List<String> getSequence(
            Syntax syntax,
            String start,
            int numNotes
    );
}
