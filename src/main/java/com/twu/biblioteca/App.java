package com.twu.biblioteca;


import com.twu.inputAsker.InputAsker;
import com.twu.menu.Menu;
import com.twu.menu.MenuDispatcher;
import com.twu.services.BookService;
import com.twu.services.ListBookService;
import com.twu.welcomeUser.WelcomeUser;

public class App {


    public static void main(String[] args) {

        Menu menu = new Menu();
        WelcomeUser welcomeUser = new WelcomeUser(menu);
        InputAsker inputAsker = new InputAsker(System.in, System.out);

        ListBookService listBookService = new ListBookService();
        BookService bookService = new BookService();
        MenuDispatcher menuDispatcher = new MenuDispatcher(menu, inputAsker, listBookService, bookService);

        BibliotecaLauncher bibliotecaLauncher = new BibliotecaLauncher(welcomeUser, inputAsker, menuDispatcher);
        bibliotecaLauncher.startApp();

    }
}
