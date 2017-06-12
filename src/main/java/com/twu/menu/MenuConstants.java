package com.twu.menu;


import java.util.ArrayList;

public class MenuConstants {

    public final static String MENU = "====== Bangalore Library - MENU ====== \n\n\n\n";

    public static final String MENU_OPTIONS = "1. List all books \n2. Quit";


    public static final ArrayList<String> menuOptions = new ArrayList<String>(){{
        add("1");
        add("2");
    }};

}
