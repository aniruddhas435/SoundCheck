package com.soundcheck.player;

import org.springframework.stereotype.Component;

import javax.sound.sampled.*;

@Component
public class Tone {
    public static float SAMPLE_RATE = 20000f;

    public static void sound(double hz, int msec, double vol) throws LineUnavailableException {
        if(hz <= 0) throw new IllegalArgumentException("Frequency less than or equal to zero");
        if(msec <= 0) throw new IllegalArgumentException("Duration less than zero");
        if(vol > 1.0 || vol < 0.0) throw new IllegalArgumentException("Volume out of range 0.0 - 1.0");

        byte[] buffer = new byte[(int)SAMPLE_RATE * msec / 1000];

        for(int i = 0; i < buffer.length; i++) {
            double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
            buffer[i] = (byte)(Math.sin(angle) * 127.0 * vol);
        }

        for(int i = 0; i < SAMPLE_RATE / 100.0 && i < buffer.length / 2; i++) {
            buffer[i] = (byte)(buffer[i] * i / (SAMPLE_RATE / 100.0));
            buffer[buffer.length - 1 - i] = (byte)(buffer[buffer.length - 1 - i] * i / (SAMPLE_RATE / 100.0));
        }

        AudioFormat af = new AudioFormat(SAMPLE_RATE, 8, 1, true, false);
        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);
        sdl.start();
        sdl.write(buffer, 0, buffer.length);
        sdl.drain();
        sdl.close();
    }
}