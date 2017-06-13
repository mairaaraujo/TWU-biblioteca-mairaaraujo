package com.twu.services;


import com.twu.books.Book;

public class ListBookService {



    public void printBookList() {

        System.out.println(ListBookServiceConstants.BOOK_LIST_HEAD);
        for (String id : Book.bookList.keySet()) {
            if(Book.bookList.get(id).isAvailable())
                System.out.println(Book.bookList.get(id).getDetails());
        }
    }

}
