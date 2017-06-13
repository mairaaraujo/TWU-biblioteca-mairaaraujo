package com.twu.menu;


import com.twu.inputAsker.InputAsker;
import com.twu.inputAsker.InputAskerValidator;
import com.twu.services.BookService;
import com.twu.services.ListBookService;
import com.twu.services.MovieService;
import com.twu.util.BibliotecaConstants;

public class MenuDispatcher {

    InputAsker inputAsker;
    ListBookService listBookService;
    BookService bookService;
    MovieService movieService;

    public MenuDispatcher() {

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
        listBookService = new ListBookService();
        listBookService.printBookList();
        showSubMenuOptions();

    }

    public void showSubMenuOptions() {
        bookService = new BookService();
        inputAsker = new InputAsker(System.in, System.out);
        bookService.askOption(inputAsker);
    }

    public void proceedToMenu() {
        inputAsker.ask(BibliotecaConstants.CONTINUE_MESSAGE);
        inputAsker.pressToContinue();

    }

    public void printMovieList() {
        movieService = new MovieService();
        movieService.printMovieList();
        showMovieOptions();
    }

    public void showMovieOptions() {
        movieService = new MovieService();
        inputAsker = new InputAsker(System.in, System.out);
        movieService.askOption(inputAsker);
    }
}
