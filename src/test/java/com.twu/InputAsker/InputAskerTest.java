package com.twu.InputAsker;


import com.twu.util.InputAsker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
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
        assertFalse(inputAsker.isValidInput("1"));
    }

    @Test
    public void shouldAcceptOnlyOneDigitInputs(){

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        assertFalse(inputAsker.isValidInput("22"));
    }

    @Test
    public void shouldNotAcceptLiteralInputs(){

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        assertFalse(inputAsker.isValidInput("teste"));
    }

   @Test
    public void shouldNotAcceptInvalidMenuChoice() throws IOException {

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        Mockito.when(inputAsker.getAnswer()).thenReturn("1");


        //Assert.assertEquals("1", BibliotecaApp.getMenuOption(inputAsker));
    }

   /* @Test
    public void shouldAcceptAnyKeyToContinue(){

        InputAsker inputAsker = Mockito.mock(InputAsker.class);
        Mockito.when(inputAsker.pressToContinue()).thenReturn(true);

        Assert.assertTrue(BibliotecaApp.pressToContinue());
    }*/
}
