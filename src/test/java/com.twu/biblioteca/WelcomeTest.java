package com.twu.biblioteca;

import com.twu.util.InputAsker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WelcomeTest {

    @Mock
    Menu menu;

    @Mock
    InputAsker inputAsker;

    @InjectMocks
    WelcomeUser welcomeUser;

    @Test
    public void isMenuPrinted() throws Exception {

        welcomeUser = new WelcomeUser(menu);
        welcomeUser.proceedToMenu(inputAsker);

        Mockito.verify(menu).showMenu();
    }
}
