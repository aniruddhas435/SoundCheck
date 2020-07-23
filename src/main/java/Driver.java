import com.soundcheck.config.SoundCheckConfig;
import com.soundcheck.player.Player;
import com.soundcheck.processor.Distribution;
import com.soundcheck.processor.SyntaxBuilder;
import com.soundcheck.syntax.Syntax;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sound.sampled.LineUnavailableException;
import java.util.Map;

public class Driver {
    public static void play(String filePath, String low,
                            String high, String outFileName, String start,
                            double baseFrequency, int msec, double volume,
                            int beatsPerCycle, int numCycles) throws LineUnavailableException {
        ApplicationContext context = new AnnotationConfigApplicationContext(SoundCheckConfig.class);
        SyntaxBuilder builder = context.getBean(SyntaxBuilder.class);
        Syntax syntax = builder.buildSyntax(filePath, low, high, outFileName, start);

        Map<String, Distribution> derivations = syntax.getDerivations();

        System.out.println(syntax);

        Player player = new Player(baseFrequency);
        player.setSyntax(syntax);
        player.setStart(start);
        player.setNumNotes(beatsPerCycle, numCycles);

        player.play(msec, volume);
    }

    public static void main(String[] args) throws LineUnavailableException {
        play(
                "C:\\Users\\Aniruddha Sarkar\\Documents\\github\\SoundCheck\\src\\test\\raag_files\\palta_test\\malkauns\\malkauns.raag",
                "dha_",
                "ga*",
                "first",
                "Start",
                360.00,
                70,
                0.2,
                16,
                10
        );

    }
}
