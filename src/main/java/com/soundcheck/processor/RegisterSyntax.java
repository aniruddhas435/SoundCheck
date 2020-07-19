package com.soundcheck.processor;

import com.soundcheck.syntax.Syntax;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;

@Service
public class RegisterSyntax {
    public String register(Syntax syntax,
                           String outFileName, String filePath) {
        String str = syntax.toString();
        String folderPath = new File(filePath).getParent();
        String fileName = outFileName == "" || outFileName == null ? "final" : outFileName;
        System.out.println(fileName + " " + outFileName);
        String newFilePath = folderPath + "\\" + fileName + ".syntax";

        try {
            Files.write(Paths.get(newFilePath),
                    str.getBytes(),
                    StandardOpenOption.CREATE);
        } catch(IOException e) {
            e.printStackTrace();
        }

        return str;
    }
}
