package com.twu.services;


import com.twu.books.Book;
import com.twu.inputAsker.InputAsker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {


    @Mock
    Book book;


    @Mock
    InputAsker inputAsker;

    @InjectMocks
    BookService bookService;


    @Test
    public void returnBook() throws Exception {
        book = new Book();
        bookService.returnBook(book);

        Assert.assertEquals(true, book.isAvailable());
    }

    @Test
    public void checkoutBook() throws Exception {
        book = new Book();
        bookService.checkoutBook(book);

        Assert.assertFalse(book.isAvailable());
    }
}
