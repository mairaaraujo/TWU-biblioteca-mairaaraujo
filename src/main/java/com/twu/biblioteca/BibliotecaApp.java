package com.twu.biblioteca;


import com.twu.util.InputAsker;

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
        getMenuOption(new InputAsker(System.in, System.out));

    }

    public static void getMenuOption(InputAsker inputAsker) {

        inputAsker.ask("Choose an option:");
        inputAsker.getAnswer();
        while(!inputAsker.isValidInput(inputAsker.getAnswer()))
            inputAsker.ask("Choose an option:");

        /*while(!option.equals("1") && !option.equals("2")){
            inputAsker.ask("Please choose a valid option");
        }*/

    }
}
