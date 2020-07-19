import com.soundcheck.config.SoundCheckConfig;
import com.soundcheck.listeners.RaagCustomListener;
import com.soundcheck.player.transformers.DigitsToNotes;
import com.soundcheck.player.transformers.SchemeToDerivation;
import com.soundcheck.processor.Distribution;
import com.soundcheck.processor.SyntaxBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Try {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SoundCheckConfig.class);
//        SyntaxBuilder builder = context.getBean(SyntaxBuilder.class);
//        builder.buildSyntax(
//                "C:\\Users\\Aniruddha Sarkar\\IdeaProjects\\SoundCheck\\src\\test\\raag_files\\palta_test\\malkauns\\malkauns.raag",
//                "ma_",
//                "ma*",
//                "malkauns",
//                "Start"
//        );
        List<String> ascent = Arrays.asList(
                new String[]{"Sa", "ga", "ma", "dha", "ni"}
        );
        List<String> descent = Arrays.asList(
                new String[]{"Sa*", "ni", "dha", "ma", "ga"}
        );

//        DigitsToNotes digitsToNotes = context.getBean(DigitsToNotes.class);
//        String seq = digitsToNotes.transform(
//                "(134, 8)",
//                "Sa",
//                ascent,
//                descent
//        );
//
//        System.out.println(seq);

        Pattern pattern = Pattern.compile("\\((.*?)\\)");
        Matcher matcher = pattern.matcher("PaltaUp(Sa*)");

        if(matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
