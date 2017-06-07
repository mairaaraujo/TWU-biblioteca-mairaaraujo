package com.twu.biblioteca;


import java.io.IOException;

public class BibliotecaApp {

    public static String getWelcomeMessage(){

        return BibliotecaConstants.WELCOME_MESSAGE;
    }

    public static void printWelcomeMessage() {

        System.out.println(getWelcomeMessage());
    }


    public static void startApp() throws IOException {

        printWelcomeMessage();
        //continueToMenu(new InputAsker(System.in, System.out));
    }
/*

    public static String getMenu() {

        return BibliotecaConstants.MENU;
    }

    private static void continueToMenu(InputAsker inputAsker) throws IOException {

        inputAsker.ask(BibliotecaConstants.CONTINUE_MESSAGE);
        inputAsker.pressToContinue();

        showMenu();
    }

    public static void showMenu() throws IOException {

        System.out.println(BibliotecaConstants.MENU);
        System.out.println(BibliotecaConstants.MENU_OPTIONS);

        getMenuOption(new InputAsker(System.in, System.out));
    }

    public static String getMenuOption(InputAsker inputAsker) throws IOException {

        inputAsker.ask(BibliotecaConstants.CHOOSE_AN_OPTION);
        String answer = inputAsker.getAnswer();
        while(!inputAsker.isValidInput(answer)){
           inputAsker.ask(BibliotecaConstants.SELECT_VALID_OPTION);
           answer = inputAsker.getAnswer();
        }
        return answer;
    }

*/

    public static void main(String[] args) throws IOException {

        startApp();
    }
}