package com.jonasriedel;

import com.jonasriedel.languages.Java;
import com.jonasriedel.languages.Javascript;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String language, helpInput;
        Scanner sc = new Scanner(System.in);

        Main.printHelp();

        helpInput = sc.nextLine();

        if (helpInput.equals("help")) {
            Main.printLanguages();
        }

        Main.printHelp();

        language = sc.nextLine();

        switch (language) {
            case "Java" -> {
                CreateFile.create(".gitignore_java");
                WriteFile.writeFile(".gitignore_java", Java.generateJava());
                Main.printGeneratedInfo();
            }
            case "Javascript" -> {
                CreateFile.create(".gitignore_javascript");
                WriteFile.writeFile(".gitignore_javascript", Javascript.generateJavascript());
                Main.printGeneratedInfo();
            }
            default -> System.out.println("Not a valid language! Try again.");
        }
    }

    private static void printLanguages() {
        System.out.println("Java, Javascript");
    }

    private static void printHelp() {
        System.out.println("Which language? Type 'help' for a list of all languages.");
    }

    private static void printGeneratedInfo() {
        System.out.println(".gitignore generated!");
    }
}
