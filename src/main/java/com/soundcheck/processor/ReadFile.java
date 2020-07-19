package com.soundcheck.processor;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
public class ReadFile {
    public String readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        String content = "";

        while(line != null) {
            content += line + "\n";
            line = reader.readLine();
        }

        return content;
    }
}
