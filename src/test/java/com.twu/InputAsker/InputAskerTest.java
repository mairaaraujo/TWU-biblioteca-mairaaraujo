package com.twu.InputAsker;


import com.twu.biblioteca.BibliotecaApp;
import com.twu.util.InputAsker;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;


/**
 * Created by mairaaraujo on 05/06/17.
 */
public class InputAskerTest {

    /*@Test
    public void shouldAcceptValidMenuChoice() throws IOException {

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        Mockito.when(inputAsker.getAnswer()).thenReturn("1");

        Assert.assertEquals("1", BibliotecaApp.getMenuOption(inputAsker));
    }*/


    @Test
    public void shouldAcceptOneDigitInput(){

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        Assert.assertFalse(inputAsker.isValidInput("1"));
    }

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

   @Test
    public void shouldNotAcceptInvalidMenuChoice() throws IOException {

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        Mockito.when(inputAsker.getAnswer()).thenReturn("1");

        Assert.assertEquals("1", BibliotecaApp.getMenuOption(inputAsker));
    }

   /* @Test
    public void shouldAcceptAnyKeyToContinue(){

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        Mockito.when(inputAsker.pressToContinue()).thenReturn(true);

        Assert.assertTrue(BibliotecaApp.pressToContinue());
    }*/
}
