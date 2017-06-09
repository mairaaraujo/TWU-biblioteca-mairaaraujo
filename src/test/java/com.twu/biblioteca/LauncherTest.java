package com.twu.biblioteca;


import com.twu.util.InputAsker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LauncherTest {

    @InjectMocks
    BibliotecaLauncher bibliotecaLauncher;

    @Mock
    WelcomeUser welcomeUser;

    @Mock
    InputAsker inputAsker;

    @Mock
    Menu menu;

    @Test
    public void isWelcomeMessagePrinted() {

        bibliotecaLauncher = new BibliotecaLauncher(welcomeUser, inputAsker);
        bibliotecaLauncher.startApp();
        Mockito.verify(welcomeUser).showMessage();
    }

    @Test
    public void isProceedToMenuInvoked() throws Exception {

        bibliotecaLauncher = new BibliotecaLauncher(welcomeUser, inputAsker);
        bibliotecaLauncher.startApp();
        Mockito.verify(welcomeUser).proceedToMenu(inputAsker);

    }


}
