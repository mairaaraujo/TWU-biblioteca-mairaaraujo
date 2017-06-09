package com.twu.biblioteca;


import com.twu.util.InputAsker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BibliotecaTest {

    @Mock
    BibliotecaApp bibliotecaApp;

    @Mock
    InputAsker inputAsker;

    @Test
    public void checkWelcomeMessageIsBeingInvoked() throws Exception {

        Mockito.doCallRealMethod().when(bibliotecaApp).startApp();
        bibliotecaApp.startApp();
        Mockito.verify(bibliotecaApp).printMessage(Mockito.anyString());
    }

    @Test
    public void printMessageTest() throws Exception {

        String message = "teste";

        bibliotecaApp.printMessage(message);
        Mockito.verify(bibliotecaApp).printMessage(Mockito.anyString());
    }

    @Test
    public void checkIfMenuIsBeingShowed() throws Exception {

        Mockito.doCallRealMethod().when(bibliotecaApp).continueToMenu(inputAsker);
        bibliotecaApp.continueToMenu(inputAsker);
        Mockito.verify(bibliotecaApp).showMenu();
    }

}
