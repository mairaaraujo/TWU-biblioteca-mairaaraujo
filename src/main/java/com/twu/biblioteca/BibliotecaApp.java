package com.twu.biblioteca;


import com.twu.util.InputAsker;

public class BibliotecaApp {




    public void startApp() {
      printMessage(BibliotecaConstants.WELCOME_MESSAGE);

    }

    public void printMessage(String message) {

        System.out.println(message);
    }

    public void continueToMenu(InputAsker inputAsker) {
        inputAsker.ask(BibliotecaConstants.CONTINUE_MESSAGE);
        inputAsker.pressToContinue();

        showMenu();
    }


    public void showMenu() {

        printMessage(BibliotecaConstants.MENU);
        printMessage(BibliotecaConstants.MENU_OPTIONS);
    }
}