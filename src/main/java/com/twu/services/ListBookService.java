package com.twu.services;


import com.twu.books.Book;

public class ListBookService {

    public void printBookList() {
        for (Book book: Book.bookList ) {
            System.out.println(book.getDetails());
        }
    }
}
