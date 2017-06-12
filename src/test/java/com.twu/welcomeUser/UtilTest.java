package com.twu.welcomeUser;


import com.twu.books.Book;
import com.twu.util.Util;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UtilTest {

    @Mock
    Book book;

    @Test
    public void validateBookAvailabity() throws Exception {
        Util util = new Util();
        Assert.assertTrue(util.isBookAvailable(Book.bookList.get("01")));

    }

    @Test
    public void validateBookNotAvailable() throws Exception {
        Util util = new Util();
        book.setAvailable(false);

        Assert.assertEquals(false, util.isBookAvailable(book));

    }

    @Test
    public void isAnExistingBook() throws Exception {
        Util util = new Util();
        String input = "01";

        Assert.assertTrue(util.isAnExistingBook(input));
    }

    @Test
    public void shouldNotAcceptNonExistingBook() throws Exception {
        Util util = new Util();
        String input = "some random book";

        Assert.assertFalse(util.isAnExistingBook(input));
    }


}
