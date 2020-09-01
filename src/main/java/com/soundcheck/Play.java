package com.soundcheck;

import com.soundcheck.launcher.Launcher;

import javax.sound.sampled.LineUnavailableException;

public class Play {
    public static void main(String[] args) throws LineUnavailableException {
        Launcher.play(
                "src/test/raag_files/miyan_ki_malhar/test3/mkm.raag"
        );
    }
}
