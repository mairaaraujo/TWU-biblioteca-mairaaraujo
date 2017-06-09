package com.twu.biblioteca;


import com.twu.util.InputAsker;

public class BibliotecaLauncher {


    private WelcomeUser welcomeUser;
    private InputAsker inputAsker;


    public BibliotecaLauncher(WelcomeUser welcomeUser, InputAsker inputAsker) {
        this.welcomeUser = welcomeUser;
        this.inputAsker = inputAsker;
    }

    public void startApp() {
        welcomeUser.showMessage();
        welcomeUser.proceedToMenu(inputAsker);
    }
}
