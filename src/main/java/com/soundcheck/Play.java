package com.soundcheck;

import com.soundcheck.launcher.Launcher;

import javax.sound.sampled.LineUnavailableException;

public class Play {
    public static void main(String[] args) throws LineUnavailableException {
        Launcher.play(
                "C:\\Users\\Aniruddha Sarkar\\Documents\\github\\SoundCheck\\src\\test\\raag_files\\error_files_test\\mkm\\mkm1.raag",
                true
        );
    }
}
