package com.twu.biblioteca;


import com.twu.menu.MenuDispatcher;
import com.twu.welcomeUser.WelcomeUser;
import com.twu.inputAsker.InputAsker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BibliotecaLauncherTest {

    @InjectMocks
    BibliotecaLauncher bibliotecaLauncher;

    @Mock
    WelcomeUser welcomeUser;

    @Mock
    InputAsker inputAsker;

    @Mock
    MenuDispatcher menuDispatcher;

    @Test
    public void isWelcomeMessagePrinted() {

        bibliotecaLauncher = new BibliotecaLauncher(welcomeUser, inputAsker, menuDispatcher);
        bibliotecaLauncher.startApp();
        Mockito.verify(welcomeUser).showMessage();
    }

    @Test
    public void isProceedToMenuInvoked() throws Exception {

        bibliotecaLauncher = new BibliotecaLauncher(welcomeUser, inputAsker, menuDispatcher);
        bibliotecaLauncher.startApp();
        Mockito.verify(welcomeUser).proceedToMenu(inputAsker);

    }


}
