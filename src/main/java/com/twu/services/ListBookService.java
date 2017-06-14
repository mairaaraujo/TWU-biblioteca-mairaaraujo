package com.twu.services;


import com.twu.books.Book;

public class ListBookService {


    private static ListBookService instance = new ListBookService();

    public static ListBookService getInstance(){
        return instance;
    }

    public void printBookList() {

        System.out.println(ListBookServiceConstants.BOOK_LIST_HEAD);
        for (String id : Book.bookList.keySet()) {
            if(Book.bookList.get(id).isAvailable())
                System.out.println(Book.bookList.get(id).getDetails());
        }
    }

}
