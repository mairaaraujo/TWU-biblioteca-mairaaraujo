package com.twu.biblioteca;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class BibliotecaTest {

    @Mock
    BibliotecaApp bibliotecaApp;

    @Test
    public void testWelcomeMessage(){
       Assert.assertEquals(BibliotecaConstants.WELCOME_MESSAGE, BibliotecaApp.getWelcomeMessage());
    }

    @Test
    public void testMenu(){
        Assert.assertEquals(BibliotecaConstants.MENU, BibliotecaApp.getMenu());
    }

    @Test
    public void name() throws Exception {
       bibliotecaApp.startApp();
       Mockito.
    }
}
