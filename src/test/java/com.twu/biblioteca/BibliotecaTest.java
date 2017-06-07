package com.twu.biblioteca;


import com.twu.util.InputAsker;
import org.junit.Test;
import org.mockito.Mockito;

public class BibliotecaTest {

    BibliotecaApp bibliotecaApp = Mockito.mock(BibliotecaApp.class);


    @Test
    public void checkWelcomeMessageIsBeingInvoked() throws Exception {

        bibliotecaApp.startApp();
        Mockito.verify(bibliotecaApp).printWelcomeMessage();
    }

    @Test
    public void checkContinueToMenuIsBeingInvoked(){

        InputAsker inputAsker = new InputAsker(System.in, System.out);

        bibliotecaApp.startApp();
        Mockito.verify(bibliotecaApp).continueToMenu(inputAsker);
    }


}
