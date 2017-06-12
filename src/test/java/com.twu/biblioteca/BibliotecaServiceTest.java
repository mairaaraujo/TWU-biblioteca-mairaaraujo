package com.twu.biblioteca;

import com.twu.inputAsker.InputAsker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BibliotecaServiceTest {

    @Mock
    InputAsker inputAsker;

    @InjectMocks
    BibliotecaService bibliotecaService;

    @Test
    public void listBooksIsPrinted() throws Exception {

        bibliotecaService = new BibliotecaService(inputAsker);
        bibliotecaService.printListBooks(inputAsker);


    }
}
