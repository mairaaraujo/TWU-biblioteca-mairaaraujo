package com.twu.inputAsker;

import java.io.PrintStream;
import java.util.Scanner;

public class InputAsker {

    public static InputAsker instance = new InputAsker();


    private Scanner scanner;
    private PrintStream out;

    private InputAsker() {
        scanner = new Scanner(System.in);
        out = System.out;
    }

    public static InputAsker getInstance(){
        return instance;
    }


    public void ask(String message) {
        out.println(message);
    }

    public String getAnswer(){
        return scanner.nextLine();
    }

    public void pressToContinue() {
        scanner.nextLine();
    }

}
