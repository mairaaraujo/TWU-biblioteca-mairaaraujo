package com.twu.biblioteca;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mairaaraujo on 01/06/17.
 */
public class BibliotecaTest {


   @Test
    public void testWelcomeMessage(){
       Assert.assertEquals(BibliotecaConstants.WELCOME_MESSAGE, BibliotecaApp.getWelcomeMessage());

    }

    @Test
    public void testMenu(){
        Assert.assertEquals(BibliotecaConstants.MENU, BibliotecaApp.getMenu());
    }



}
