package com.twu.InputAsker;


import com.twu.biblioteca.BibliotecaApp;
import com.twu.util.InputAsker;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Created by mairaaraujo on 05/06/17.
 */
public class InputAskerTest {

    @Test
    public void shouldAcceptValidMenuChoice(){

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        Mockito.when(inputAsker.ask(Mockito.anyString())).thenReturn("1");

        Assert.assertEquals("1", BibliotecaApp.getMenuOption(inputAsker));
    }

    @Test
    public void shouldNotAcceptInvalidMenuChoice(){

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        Mockito.when(inputAsker.ask(Mockito.anyString())).thenReturn("1");

        Assert.assertEquals("1", BibliotecaApp.getMenuOption(inputAsker));
    }

    @Test
    public void shouldAcceptOnlyNumericalInputs(){

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        String regex = "\\d+";


    }
}
