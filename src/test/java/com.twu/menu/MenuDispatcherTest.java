package com.twu.menu;


import com.twu.inputAsker.InputAsker;
import com.twu.services.ListBookService;
import com.twu.services.MovieService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MenuDispatcherTest {


    @Mock
    InputAsker inputAsker;

    @Mock
    ListBookService listBookService;

    @Mock
    MovieService movieService;

    @InjectMocks
    MenuDispatcher menuDispatcher;



    @Test
    public void shouldAcceptValidOption() throws Exception {

        menuDispatcher = MenuDispatcher.getInstance();
        String option = "1";

        Assert.assertTrue(menuDispatcher.validatePickedOption(option));
    }

    @Test
    public void shouldNotAcceptInvalidOption() throws Exception {

        menuDispatcher = MenuDispatcher.getInstance();
        String option = "option";

        Assert.assertFalse(menuDispatcher.validatePickedOption(option));
    }

    @Test
    public void bookListIsPrinted() throws Exception {

        menuDispatcher = MenuDispatcher.getInstance();
        menuDispatcher.printListBooks();

        Mockito.verify(listBookService).printBookList();
    }

    @Test
    public void movieListIsPrinted() throws Exception {

        menuDispatcher = MenuDispatcher.getInstance();
        menuDispatcher.printMovieList();

        Mockito.verify(movieService).printMovieList();
    }

}
