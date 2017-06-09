package com.twu.biblioteca;


import com.twu.util.InputAsker;

public class WelcomeUser {

    Menu menu;

    public WelcomeUser(Menu menu) {
        this.menu = menu;
    }

    public void showMessage() {
        System.out.println(BibliotecaConstants.WELCOME_MESSAGE);

    }

    public void proceedToMenu(InputAsker inputAsker) {
        inputAsker.ask(BibliotecaConstants.CONTINUE_MESSAGE);
        inputAsker.pressToContinue();
        menu.showMenu();
    }
}
