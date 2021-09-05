package com.jonasriedel;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeFile(String filename, String content) {
        try {
            FileWriter writer = new FileWriter(filename);

            writer.write(content);
            writer.close();

            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred");

            e.printStackTrace();
        }
    }
}
