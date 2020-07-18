package com.ulven.techtrial.util;

import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

    public static void write(String filename, String content) {
        FileWriter writer;

        try {
            writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
