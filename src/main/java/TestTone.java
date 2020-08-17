import com.soundcheck.player.Tone;

import javax.sound.sampled.LineUnavailableException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestTone {
    public static void main(String[] args) throws LineUnavailableException, InterruptedException {
        String str = "Ni_, Sa, ma, Re, Sa, Dha_, Ni_, Sa, Dha_, Ni_, Sa, Dha_, Ni_, Sa, Dha_, Ni_, Sa, Dha_, Ni_, Sa, ma, Re, Pa, ma, ga, ma, Re, Sa, Dha_, ni_, ma_, Pa_, ni_, ma_, Pa_, ni_, Dha_, Ni_, Sa, Dha_, ni_, ma_, Pa_, ni_, ma_, Pa_, ni_, ma_, Pa_, ma_, Pa_, ni_, Dha_, ni_, ma_, Pa_, ma_, Pa_, ma_, Pa_, ni_, Dha_, ni_, ma_, Pa_, ma_, Pa_, ni_, Dha_, Ni_, Sa, Dha_, Ni_, Sa, ma, Re, Pa, ma, Pa, ma, ga, ma, Re, Sa, ma, Re, Sa, ma, Re, Sa, Dha_, ni_, ma_, Pa_, ni_, Dha_, ni_, ma_, Pa_, ni_, Dha_, Ni_, Sa, Dha_, Ni_, Sa, ma, Re, Pa, ma, Pa, ma, Pa, ni, Dha, Ni, Sa*, Dha, Ni, Sa*, Dha, Ni, Sa*, Dha, ni, ma, Pa, ni, ma, Pa, ma, Pa, ma, Pa, ni, Dha, ni, ma, Pa, ma, ga, ma, Re, Pa, ma, ga, ma, Re, Sa, ma, Re, Pa, ni, ma, Pa, ni, ma, Pa, ma, ga";
        str = str.replace(" ", "");
        List<String> seq = Arrays.asList(
                str.split(",")
        );
//        List<String> seq = Arrays.asList(
//                "Sa", "re", "Ga", "ma", "Pa", "dha", "ni", "Sa*"
//        );

        Tone.sound(seq, 140, 0.3);

//        Collections.reverse(seq);
//        Tone.sound(seq, 130, 0.3);
    }
}
