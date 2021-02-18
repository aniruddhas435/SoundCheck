package com.soundcheck;

import com.soundcheck.launcher.Launcher;

import javax.sound.sampled.LineUnavailableException;

public class Play {
    public static void main(String[] args) throws LineUnavailableException {
        Launcher.play(
                args[0],
                true
        );
    }
}
