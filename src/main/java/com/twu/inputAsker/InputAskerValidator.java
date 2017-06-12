package com.twu.inputAsker;

import com.twu.menu.MenuConstants;


public class InputAskerValidator {

    public static boolean isValidInput(String input) {
        return MenuConstants.menuOptions.contains(input);
    }
}
