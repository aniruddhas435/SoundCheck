import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Test {
    public static void main(String[] args) {
        try {
            double hertz = 370.0;
            double leap = Math.pow(2, 1.0 / 12.0);
            int volume = 2;

            exampleTone(hertz, volume);

            hertz = hertz * leap * leap;
            exampleTone(hertz, volume);

            hertz = hertz * leap * leap;
            exampleTone(hertz, volume);

            hertz = hertz * leap;
            exampleTone(hertz, volume);

            hertz = hertz * leap * leap;
            exampleTone(hertz, volume);

            hertz = hertz * leap * leap;
            exampleTone(hertz, volume);

            hertz = hertz * leap * leap;
            exampleTone(hertz, volume);

            hertz = hertz * leap;
            exampleTone(hertz, volume);
        } catch(LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void exampleTone(double hertz, int volume) throws LineUnavailableException {
        float sampleRate = 44100f;
        byte[] buff = new byte[1];
        AudioFormat audioFormat = new AudioFormat(
                sampleRate,
                8,
                1,
                true,
                false
        );

        SourceDataLine sourceDataLine = AudioSystem.getSourceDataLine(audioFormat);
        sourceDataLine.open(audioFormat);
        sourceDataLine.start();

        for(int i = 0; i < sampleRate; ++i) {
            double angle = (i / sampleRate) * hertz * 2 * Math.PI;
            buff[0] = (byte) (Math.sin(angle) * volume);
            sourceDataLine.write(buff, 0, 1);
        }

        sourceDataLine.drain();
        sourceDataLine.stop();
        sourceDataLine.close();
    }
}
