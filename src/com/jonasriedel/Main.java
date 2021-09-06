package com.jonasriedel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String language, helpInput;
        Scanner sc = new Scanner(System.in);

        Main.printHelp();

        helpInput = sc.nextLine();

        if (helpInput.equals("help")) {
            Main.printLanguages();
        }

        //Main.printHelp();

        language = sc.nextLine().toLowerCase();

        switch (language) {
            case "java" -> {
                create(".gitignore_java");
                writeFile(".gitignore_java", Files.readAllLines(Path.of("src/com/jonasriedel/utils/java.txt")));
                Main.printGeneratedInfo();
            }

            case "javascript" -> {
                create(".gitignore_javascript");
                writeFile(".gitignore_javascript", Files.readAllLines(Path.of("src/com/jonasriedel/utils/javascript.txt")));
                Main.printGeneratedInfo();
            }

            case "nodejs" -> {
                create(".gitignore_nodejs");
                writeFile(".gitignore_nodejs", Files.readAllLines(Path.of("src/com/jonasriedel/utils/nodejs.txt")));
                Main.printGeneratedInfo();
            }

            default -> System.out.println("Not a valid language! Try again.");
        }
    }

    private static void printLanguages() {
        System.out.println("Java, Javascript, NodeJS");
    }

    private static void printHelp() {
        System.out.println("Which language? Type 'help' for a list of all languages.");
    }

    private static void printGeneratedInfo() {
        System.out.println(".gitignore generated!");
    }

    public static void writeFile(String filename, List<String> content) {
        try {
            FileWriter writer = new FileWriter(filename);

            writer.write(String.valueOf(content));
            writer.close();

            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred");

            e.printStackTrace();
        }
    }

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
