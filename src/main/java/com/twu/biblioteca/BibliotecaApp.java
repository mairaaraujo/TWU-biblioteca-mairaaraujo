package com.twu.biblioteca;


import com.twu.util.InputAsker;

public class BibliotecaApp {

    public  void startApp() {
       printWelcomeMessage();
       //continueToMenu(new InputAsker(System.in, System.out));

    }

    public void printWelcomeMessage() {

        System.out.println(BibliotecaConstants.WELCOME_MESSAGE);
    }

    public void continueToMenu(InputAsker inputAsker) {

    }
}