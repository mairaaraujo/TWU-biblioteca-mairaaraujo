package com.twu.services;

import com.twu.user.User;

public class UserService {

    public boolean isValidUser(String libraryNumber) {
        return User.users.containsKey(libraryNumber);
    }

    public boolean isValidPassword(User user, String password) {
        return  user.getPassword().equals(password);
    }



}
