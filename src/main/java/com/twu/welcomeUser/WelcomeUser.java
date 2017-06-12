package com.twu.welcomeUser;


import com.twu.util.BibliotecaConstants;
import com.twu.menu.Menu;
import com.twu.inputAsker.InputAsker;

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
