import com.soundcheck.listeners.error.ErrorHandler;
import com.soundcheck.processor.Parser;
import com.soundcheck.processor.ReadFile;

import java.io.IOException;

public class TestSyntaxBuilder {
    public static void main(String[] args) throws IOException {
        ReadFile reader = new ReadFile();
        ErrorHandler.callFromClient = true;
        String content = reader.readFile(
                "C:\\Users\\Aniruddha Sarkar\\Documents\\github\\SoundCheck\\src\\test\\raag_files\\error_files_test\\mkm\\mkm1.raag"
        );
        Object[] objects = new Parser().parse(content);
        System.out.println(ErrorHandler.hasErrorOccured);
    }
}
