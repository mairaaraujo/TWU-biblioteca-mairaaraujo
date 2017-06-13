package com.twu.menu;


import java.util.ArrayList;

public class MenuConstants {

    public static final String MENU = "====== Bangalore Library - MENU ====== \n\n\n\n";

    public static final String MENU_OPTIONS = "1. List all books \n2. List all movies \n3. Quit";

    public static final String LIST_BOOKS = "1";

    public static final String LIST_MOVIES = "2";

    public static final String CHOOSE_AN_OPTION = "Choose an option:";

    public static final String SELECT_VALID_OPTION = "Select a valid option!";

    public static final ArrayList<String> menuOptions = new ArrayList<String>(){{
        add("1");
        add("2");
        add("3");
    }};

}
