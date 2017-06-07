package com.twu.biblioteca;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class BibliotecaTest {

    @Mock
    BibliotecaApp bibliotecaApp;

    @Test
    public void checkWelcomeMessageIsBeingInvoked() throws Exception {

        Mockito.verify(bibliotecaApp).printWelcomeMessage();
    }
}
