package com.twu.biblioteca;


import com.twu.menu.MenuDispatcher;
import com.twu.welcomeUser.WelcomeUser;
import com.twu.inputAsker.InputAsker;

public class BibliotecaLauncher {


    private WelcomeUser welcomeUser;
    private InputAsker inputAsker;
    private MenuDispatcher menuDispatcher;


    public BibliotecaLauncher(WelcomeUser welcomeUser, InputAsker inputAsker, MenuDispatcher menuDispatcher) {
        this.welcomeUser = welcomeUser;
        this.inputAsker = inputAsker;
        this.menuDispatcher = menuDispatcher;
    }

    public void startApp() {
        welcomeUser.showMessage();
        welcomeUser.proceedToMenu(inputAsker);
        menuDispatcher.pickMenuOption(inputAsker);

    }
}
