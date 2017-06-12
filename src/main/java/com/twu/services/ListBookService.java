package com.twu.services;


import com.twu.books.Book;
import com.twu.menu.MenuConstants;

public class ListBookService {

    public void printBookList() {

        System.out.println(MenuConstants.BOOK_LIST_HEAD);
        for (String id : Book.bookList.keySet()) {
            System.out.println(Book.bookList.get(id).getDetails());
        }
    }
}
