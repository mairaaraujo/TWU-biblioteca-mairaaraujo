package com.twu.services;


import com.twu.books.Book;
import com.twu.inputAsker.InputAsker;
import com.twu.util.Util;

public class BookService {


    public void checkoutBook(Book book) {
        book.setAvailable(false);
        System.out.println("checked book: " + book.getName());
        System.out.println(BookServiceConstants.SUCCESSFULL_CHECKOUT);
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println("returned book: " + book.getName());
        System.out.println(BookServiceConstants.SUCCESSFULL_RETURN);


    }

    public Book getBookById(String bookId) {

        if(Util.isAnExistingBook(bookId))
            return Book.bookList.get(bookId);
        else
            return null;
    }

    public void askOption(InputAsker inputAsker){
        inputAsker.ask(BookServiceConstants.SUBMENU_BOOK_LIST);
        String answer = inputAsker.getAnswer();

        processAction(Util.getAction(answer), Util.getBookId(answer));
    }

    public void processAction(String action, String bookId) {

        if(BookServiceConstants.CHECKOUT_BOOK.equals(action.trim().toLowerCase())){
            if(Util.isAnExistingBook(bookId))
                checkoutBook(getBookById(bookId));
            else
                System.out.println(BookServiceConstants.UNSUCCESSFULL_CHECKOUT);
        }
        else if(BookServiceConstants.RETURN_BOOK.equals(action.trim().toLowerCase())){
            if(Util.isAnExistingBook(bookId))
                returnBook(getBookById(bookId));
            else
                System.out.println(BookServiceConstants.UNSUCCESSFULL_RETURN);
        }
    }
}
