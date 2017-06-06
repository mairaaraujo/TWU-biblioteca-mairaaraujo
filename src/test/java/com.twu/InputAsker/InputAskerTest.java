package com.twu.InputAsker;


import com.twu.util.InputAsker;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Created by mairaaraujo on 05/06/17.
 */
public class InputAskerTest {

    /*@Test
    public void shouldAcceptValidMenuChoice(){

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        Mockito.when(inputAsker.getAnswer()).thenReturn("1");

        Assert.assertEquals("1", BibliotecaApp.getMenuOption(inputAsker));
    }*/

/*
    @Test
    public void shouldAcceptOneDigitInput(){

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        Assert.assertTrue(inputAsker.isValidInput("1"));
    }*/

    @Test
    public void shouldAcceptOnlyOneDigitInputs(){

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        Assert.assertFalse(inputAsker.isValidInput("22"));
    }

    @Test
    public void shouldNotAcceptLiteralInputs(){

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        Assert.assertFalse(inputAsker.isValidInput("teste"));
    }

   /* @Test
    public void shouldNotAcceptInvalidMenuChoice(){

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        Mockito.when(inputAsker.getAnswer()).thenReturn("1");

        Assert.assertEquals("1", BibliotecaApp.getMenuOption(inputAsker));
    }*/
}
