package com.twu.menu;


import com.twu.inputAsker.InputAsker;
import com.twu.inputAsker.InputAskerValidator;
import com.twu.services.ListBookService;

public class MenuDispatcher {

    Menu menu;
    InputAsker inputAsker;
    ListBookService listBookService;

    public MenuDispatcher(Menu menu, InputAsker inputAsker, ListBookService listBookService) {
        this.menu = menu;
        this.inputAsker = inputAsker;
        this.listBookService = listBookService;
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

        if(MenuConstants.LIST_BOOKS.equals(option))
            printListBooks();

        //  else if(MenuConstants.QUIT.equals(option))
    }
    public void printListBooks() {
        listBookService.printBookList();
    }
}
