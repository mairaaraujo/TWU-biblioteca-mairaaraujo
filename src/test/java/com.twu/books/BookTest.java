package com.twu.books;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mairaaraujo on 06/06/17.
 */
public class BookTest {

    @Test
    public void testGetBookName(){
        Book book = new Book();

        book.setName("1984");

        Assert.assertEquals("1984", book.getName());
    }

    @Test
    public void testGetBookPublishedYear(){

        Book book = new Book();
        book.setPublishedYear(1949);

        Assert.assertEquals(1949, book.getPublishedYear());
    }

    @Test
    public void testGetAuthorName(){

        Book book = new Book();
        book.setAuthorName("George Orwell");

        Assert.assertEquals("George Orwell", book.getAuthorName());
    }

    @Test
    public void testGetBookDetails(){

        Book book = Book.bookList.get(0);
        String bookDetails = book.getName() + " || " + "Author: " + book.getAuthorName() +
                " || Publishing year: " + String.valueOf(book.getPublishedYear());

        Assert.assertEquals(bookDetails, book.getDetails(book));
    }
}
