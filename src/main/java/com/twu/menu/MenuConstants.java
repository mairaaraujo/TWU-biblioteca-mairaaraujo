package com.twu.menu;


import java.util.ArrayList;

public class MenuConstants {

    public static final String MENU = "====== Bangalore Library - MENU ====== \n\n\n\n";

    public static final String MENU_OPTIONS = "1. List all books \n2. Quit";

    public static final String LIST_BOOKS = "1";

    public static final String CHOOSE_AN_OPTION = "Choose an option:";

    public static final String SELECT_VALID_OPTION = "Select a valid option!";

    public static final String BOOK_LIST_HEAD = " ====== Bangalore Library - AVAILABLE BOOKS ====== \n\n\n\n";



    public static final ArrayList<String> menuOptions = new ArrayList<String>(){{
        add("1");
        add("2");
    }};

}
