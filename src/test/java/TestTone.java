import com.soundcheck.player.Tone;

import javax.sound.sampled.LineUnavailableException;
import java.util.Arrays;

public class TestTone {
    public static void main(String[] args) throws LineUnavailableException {
        String str = "ma Pa ni Dha Ni Ni Sa* Re* ma Pa ga ma Re Re Pa Pa ma Pa ga ma Re Sa Ni_ Sa";
        String[] swars = str.split(" ");

        Tone.sound(
                Arrays.asList(swars),
                150,
                0.3
        );
    }
}
