package com.soundcheck.player;

import com.soundcheck.config.SoundCheckConfig;
import com.soundcheck.player.builders.BuildSequence;
import com.soundcheck.syntax.Syntax;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sound.sampled.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;

public class Player extends Sargam {

    private Syntax syntax;
    private String start;
    private int numNotes;
    private ApplicationContext context;
    private String buildFunctionRegisterFile;

    public String getBuildFunctionRegisterFile() {
        return buildFunctionRegisterFile;
    }

    public void setBuildFunctionRegisterFile(String buildFunctionRegisterFile) {
        this.buildFunctionRegisterFile = buildFunctionRegisterFile;
    }

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

    public void play(int msec, double vol,
                     String filePath, String playFileName,
                     String wavFileName) throws LineUnavailableException {

        BuildSequence buildSequence = context.getBean(BuildSequence.class);
        List<String> seq = buildSequence.getSequence(syntax, start, numNotes);
        String whatHappens = buildSequence.getWhatHappens();

        byte[] buffer = Tone.sound(seq, msec, vol);
        System.out.println(buffer.length);
        if(!playFileName.isEmpty()) registerWhatHappens(whatHappens, filePath + "\\" + playFileName);
        if(!wavFileName.isEmpty()) writeToWAV(buffer, filePath + "\\" + wavFileName + ".wav");
    }

    private void writeToWAV(byte[] buffer, String filePath) {
        try {
            File file = new File(filePath);

            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                    new ByteArrayInputStream(buffer)
            );

            AudioSystem.write(
                    inputStream,
                    AudioFileFormat.Type.WAVE,
                    file
            );
        } catch (IOException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }

    private void registerWhatHappens(String whatHappens, String playFilePath) {
        try {
            Files.write(
                    Paths.get(playFilePath),
                    whatHappens.getBytes(),
                    StandardOpenOption.CREATE
            );
        } catch(IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}