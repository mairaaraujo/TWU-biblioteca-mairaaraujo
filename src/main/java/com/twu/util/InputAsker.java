package com.twu.util;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by mairaaraujo on 05/06/17.
 */
public class InputAsker {

    private final Scanner scanner;
    private final PrintStream out;

    public InputAsker(InputStream in, PrintStream out) {
        scanner = new Scanner(in);
        this.out = out;
    }

    public String ask(String message) {
        out.println(message);
        return scanner.next();
    }
}
