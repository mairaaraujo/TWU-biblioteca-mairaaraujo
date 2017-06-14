package com.twu.util;

import com.twu.books.Book;


public class Util {

    public boolean isBookAvailable(Book book) {
        return book.isAvailable();
    }

    public static boolean isAnExistingBook(String input) {
        return Book.bookList.containsKey(input);
    }

    public static String getAction(String input) {

        return input.trim().split(" ")[0];
    }

    public static String getBookId(String input){
        return input.trim().split(" ")[1];
    }

}
