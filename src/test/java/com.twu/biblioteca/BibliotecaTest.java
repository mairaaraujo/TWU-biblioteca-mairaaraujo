package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;

public class BibliotecaTest {

    BibliotecaApp bibliotecaApp = Mockito.mock(BibliotecaApp.class);


    @Test
    public void checkWelcomeMessageIsBeingInvoked() throws Exception {

        bibliotecaApp.startApp();
        Mockito.verify(bibliotecaApp).printWelcomeMessage();
    }



}
