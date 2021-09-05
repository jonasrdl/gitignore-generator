package com.jonasriedel;

import com.jonasriedel.languages.Java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userInput;
        Scanner sc = new Scanner(System.in);

        System.out.println("Which language? Type 'help' for a list of all languages.");

        /* if (sc.nextLine().equals("help")) {
            System.out.println("Java, Javascript");
        } */

        userInput = sc.nextLine();

        switch(userInput) {
            case "Java":
                CreateFile.create(".gitignore_java");
                WriteFile.writeFile(".gitignore_java", Java.generateJava());
                break;
            default:
                System.out.println("Not a valid language! Try again.");
                break;
        }
    }
}
