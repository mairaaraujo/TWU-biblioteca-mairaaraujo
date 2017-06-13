package com.twu.user;

import java.util.HashMap;

public class User {


    String name;
    String email;
    String phoneNumber;
    String libraryNumber;
    String password;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getUserDetails(){
        return "Name: " + this.getName() + " || " + "E-mail: " + this.getEmail() + " || " + "Phone number: " +  this.getPhoneNumber() + " || "
                + "Library number: " + this.getLibraryNumber();
    }

    public User(String name, String email, String phoneNumber, String libraryNumber, String password) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public static final HashMap<String, User> users = new HashMap<String, User>(){{

        put("001-1000", new User("User 1", "user1@ccc.com", "+5581000000000", "001-1000", "password"));
        put("001-1001", new User("User 2", "user2@ccc.com", "+5581000000001", "001-1001", "password"));
        put("001-1002", new User("User 3", "user3@ccc.com", "+5581000000002", "001-1002", "password"));
    }};
}
