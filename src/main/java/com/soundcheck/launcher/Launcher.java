package com.soundcheck.launcher;

import com.soundcheck.declarations.Declarations;
import com.soundcheck.player.Player;
import com.soundcheck.processor.SyntaxBuilder;
import com.soundcheck.syntax.Syntax;

import javax.sound.sampled.LineUnavailableException;
import java.io.File;

public class Launcher {
    public static Object[] play(String filePath,
                                boolean doPlay) throws LineUnavailableException {

        SyntaxBuilder builder = new SyntaxBuilder();
        Object[] objects = builder.buildSyntax(filePath);

        Syntax syntax = (Syntax) objects[0];
        Declarations declarations = (Declarations) objects[1];

        return play(syntax, declarations, doPlay, filePath);
    }

    public static Object[] play(Syntax syntax, Declarations declarations,
                                boolean doPlay, String filePath)
                                throws LineUnavailableException {

        double baseFrequency = declarations.getBaseFrequency();
        int msec = declarations.getMsec();
        double volume = declarations.getVolume();
        int beatsPerCycle = declarations.getBeatsPerCycle();
        int numCycles = declarations.getNumCycles();
        String playFileName = declarations.getPlayFileName();
        String wavFileName = declarations.getWavFileName();
        String start = declarations.getStart();

//        System.out.println("==========================================================================");
//        System.out.println(syntax.getDerivations());
//        System.out.println("==========================================================================");
//        System.out.println(syntax);
//        System.out.println("==========================================================================");

        Player player = new Player(baseFrequency);

        if(doPlay) {
            player.setSyntax(syntax);
            player.setStart(start);
            player.setNumNotes(beatsPerCycle, numCycles);
            player.play(msec, volume, new File(filePath).getParent(),
                    playFileName, wavFileName);
            return null;
        } else {
            player.setSyntax(syntax);
            player.setStart(start);
            player.setNumNotes(beatsPerCycle, numCycles);
            return player.getSequence();
        }
    }
}
