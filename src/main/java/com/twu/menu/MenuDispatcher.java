package com.twu.menu;


import com.twu.inputAsker.InputAsker;
import com.twu.inputAsker.InputAskerValidator;
import com.twu.services.BookService;
import com.twu.services.ListBookService;
import com.twu.services.MovieService;
import com.twu.util.BibliotecaConstants;

public class MenuDispatcher {
    private static MenuDispatcher instance = new MenuDispatcher();

    private InputAsker inputAsker;
    private ListBookService listBookService;
    private BookService bookService;
    private MovieService movieService;

    private MenuDispatcher() {
        inputAsker = InputAsker.getInstance();
        listBookService = ListBookService.getInstance();
        bookService = BookService.getInstance();
        movieService = MovieService.getInstance();
    }

    public static MenuDispatcher getInstance() {
        return instance;
    }

    public boolean validatePickedOption(String option) {
        return InputAskerValidator.isValidInput(option);
    }

    public void pickMenuOption(InputAsker inputAsker){
        inputAsker.ask(MenuConstants.CHOOSE_AN_OPTION);
        String option = inputAsker.getAnswer();

        while(!validatePickedOption(option)){
            inputAsker.ask(MenuConstants.SELECT_VALID_OPTION);
            option = inputAsker.getAnswer();
        }

        if(MenuConstants.LIST_BOOKS.equals(option)){
            printListBooks();
        }

        else if(MenuConstants.LIST_MOVIES.equals(option)){
            printMovieList();
        }
    }

    public void printListBooks() {
        listBookService.printBookList();
        showSubMenuOptions();

    }

    public void showSubMenuOptions() {
        bookService.askOption(inputAsker);
    }

    public void proceedToMenu() {
        inputAsker.ask(BibliotecaConstants.CONTINUE_MESSAGE);
        inputAsker.pressToContinue();

    }

    public void printMovieList() {
        movieService.printMovieList();
        showMovieOptions();
    }

    public void showMovieOptions() {
        movieService.askOption(inputAsker);
    }
}
