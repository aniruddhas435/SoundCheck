package com.soundcheck.processor;

import com.soundcheck.declarations.Declarations;
import com.soundcheck.syntax.Syntax;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@Service
public class RegisterSyntax {
    public String register(Syntax syntax, Declarations declarations,
                           String outFileName, String filePath) {
        String str = declarations.toString() + syntax.toString();
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
