package com.jonasriedel;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void create(String filename) {
        try {
            File file = new File(filename);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
