package com.jonasriedel;

import com.jonasriedel.languages.Java;
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

        switch(language) {
            case "Java":
                CreateFile.create(".gitignore_java");
                WriteFile.writeFile(".gitignore_java", Java.generateJava());
                break;
            default:
                System.out.println("Not a valid language! Try again.");
                break;
        }
    }

    private static void printLanguages() {
        System.out.println("Java, Javascript");
    }

    private static void printHelp() {
        System.out.println("Which language? Type 'help' for a list of all languages.");
    }

}
