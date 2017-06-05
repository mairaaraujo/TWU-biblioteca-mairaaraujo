package com.twu.biblioteca;



public class BibliotecaApp {

    public static String getWelcomeMessage(){
        return BibliotecaConstants.WELCOME_MESSAGE;
    }

    private static void printWelcomeMessage() {
        System.out.println(getWelcomeMessage());
    }


    public static void startApp() {
        printWelcomeMessage();
    }

    public static String getMenu() {
        return BibliotecaConstants.MENU;
    }

    public static void main(String[] args) {
        startApp();
    }
}
