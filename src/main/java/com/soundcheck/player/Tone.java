package com.soundcheck.player;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.sound.sampled.*;
import java.util.List;

@Service
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

    public static byte[] sound(List<String> seq, int msec, double vol) throws LineUnavailableException {
        if(msec <= 0) throw new IllegalArgumentException("Duration less than zero");
        if(vol > 1.0 || vol < 0.0) throw new IllegalArgumentException("Volume out of range 0.0 - 1.0");

        byte[] buffer = new byte[(int)SAMPLE_RATE * msec / 1000 * seq.size()];
        int stubLength = buffer.length / 100;
        int start = 0;

        for(int i = 0; i < seq.size(); ++i) {
            double hz = Sargam.swar.get(seq.get(i));
            int end = start + (int)SAMPLE_RATE * msec / 1000;

            for(int j = start; j < end; ++j) {
                double angle = (j - start) / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
                buffer[j] = (byte)(Math.sin(angle) * 127.0 * vol);
//                if(end - j <= stubLength) {
//                    buffer[j] = (byte)(Math.sin(angle) * 127.0 * vol / (j - start));
//                } else if(j - start <= stubLength) {
//                    buffer[j] = (byte)(Math.sin(angle) * 127 * vol / (end - j));
//                } else {
//                    buffer[j] = (byte)(Math.sin(angle) * 127.0 * vol);
//                }
            }

            for(int j = start; j < start + SAMPLE_RATE / 100 && j < end; ++j) {
                buffer[j] = (byte)(buffer[j] * (j - start) / (SAMPLE_RATE / 100.0));
                buffer[end - 1 - j] = (byte)(buffer[end - 1 - j] * (j - start) / (SAMPLE_RATE / 100.0));
            }

            start = end;
        }

        AudioFormat af = new AudioFormat(SAMPLE_RATE, 8, 1, true, false);
        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);
        sdl.start();
        sdl.write(buffer, 0, buffer.length);
        sdl.drain();
        sdl.close();

        return buffer;
    }
}