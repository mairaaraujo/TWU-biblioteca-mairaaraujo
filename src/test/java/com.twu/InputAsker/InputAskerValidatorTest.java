package com.twu.InputAsker;


import com.twu.inputAsker.InputAskerValidator;
import org.junit.Assert;
import org.junit.Test;

public class InputAskerValidatorTest {

    @Test
    public void acceptValidInput() throws Exception {
        String input = "1";
        Assert.assertTrue(InputAskerValidator.isValidInput(input));
    }

    @Test
    public void shouldNotAcceptInvalidInput() throws Exception {
        String input = "some invalid input";
        Assert.assertFalse(InputAskerValidator.isValidInput(input));
    }
}
