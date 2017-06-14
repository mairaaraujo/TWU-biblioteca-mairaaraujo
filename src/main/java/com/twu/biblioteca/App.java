package com.twu.biblioteca;


import com.twu.inputAsker.InputAsker;
import com.twu.menu.Menu;
import com.twu.menu.MenuDispatcher;
import com.twu.welcomeUser.WelcomeUser;

public class App {


    public static void main(String[] args) {

        Menu menu = new Menu();
        WelcomeUser welcomeUser = new WelcomeUser(menu);
        InputAsker inputAsker = InputAsker.getInstance();

        MenuDispatcher menuDispatcher = MenuDispatcher.getInstance();

        BibliotecaLauncher bibliotecaLauncher = new BibliotecaLauncher(welcomeUser, inputAsker, menuDispatcher);
        bibliotecaLauncher.startApp();

    }
}
