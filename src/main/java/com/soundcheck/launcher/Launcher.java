package com.soundcheck.launcher;

import com.soundcheck.config.SoundCheckConfig;
import com.soundcheck.declarations.Declarations;
import com.soundcheck.player.Player;
import com.soundcheck.processor.Distribution;
import com.soundcheck.processor.SyntaxBuilder;
import com.soundcheck.syntax.Syntax;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sound.sampled.LineUnavailableException;
import java.io.File;
import java.util.Map;

public class Launcher {
    public static void play(String filePath) throws LineUnavailableException {
        ApplicationContext context = new AnnotationConfigApplicationContext(SoundCheckConfig.class);
        SyntaxBuilder builder = context.getBean(SyntaxBuilder.class);
        Object[] objects = builder.buildSyntax(filePath);

        Syntax syntax = (Syntax) objects[0];
        Declarations declarations = (Declarations) objects[1];

        String low = declarations.getLow();
        String high = declarations.getHigh();
        double baseFrequency = declarations.getBaseFrequency();
        int msec = declarations.getMsec();
        double volume = declarations.getVolume();
        int beatsPerCycle = declarations.getBeatsPerCycle();
        int numCycles = declarations.getNumCycles();
        String playFileName = declarations.getPlayFileName();
        String wavFileName = declarations.getWavFileName();
        String start = declarations.getStart();

        Map<String, Distribution> derivations = syntax.getDerivations();

        System.out.println(syntax);

        Player player = new Player(baseFrequency);
        player.setSyntax(syntax);
        player.setStart(start);
        player.setNumNotes(beatsPerCycle, numCycles);
        player.setBuildFunctionRegisterFile(playFileName);

        player.play(msec, volume, new File(filePath).getParent(), playFileName, wavFileName);
    }
}
