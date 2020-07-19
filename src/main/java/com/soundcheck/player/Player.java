package com.soundcheck.player;

import com.soundcheck.config.SoundCheckConfig;
import com.soundcheck.player.builders.BuildSequence;
import com.soundcheck.processor.Distribution;
import com.soundcheck.syntax.Syntax;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sound.sampled.LineUnavailableException;
import java.util.*;

public class Player extends Sargam {

    private Syntax syntax;
    private String start;
    private int numNotes;
    private ApplicationContext context;

    public Player(double baseFrequency) {
        super(baseFrequency);
        context = new AnnotationConfigApplicationContext(SoundCheckConfig.class);
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public int getNumNotes() {
        return numNotes;
    }

    public void setNumNotes(int beatsPerCycle, int numCycles) {
        this.numNotes = numCycles * beatsPerCycle;
    }

    public Syntax getSyntax() {
        return syntax;
    }

    public void setSyntax(Syntax syntax) {
        this.syntax = syntax;
    }

    public void play(int msec, double vol) throws LineUnavailableException {
        BuildSequence buildSequence = context.getBean(BuildSequence.class);
        List<String> seq = buildSequence.getSequence(syntax, start, numNotes);

        for(String choice: seq) {
            System.out.printf("\r%s", choice);
            double freq = swar.get(choice);
            Tone.sound(freq, msec, vol);
        }
    }
}