package com.twu.welcomeUser;

import com.twu.inputAsker.InputAsker;
import com.twu.menu.Menu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WelcomeUserTest {

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
