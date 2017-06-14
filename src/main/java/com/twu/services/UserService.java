package com.twu.services;

import com.twu.inputAsker.InputAsker;
import com.twu.user.User;

public class UserService {

    InputAsker inputAsker;

    public UserService(InputAsker inputAsker) {
        this.inputAsker = inputAsker;
    }

    public boolean isValidUser(String libraryNumber) {
        return User.users.containsKey(libraryNumber);
    }

    public boolean isValidPassword(User user, String password) {
        return  user.getPassword().equals(password);
    }


    public String askUserLogin(InputAsker inputAsker) {
        inputAsker.ask(UserServiceConstants.USER_LOGIN);
        String user = inputAsker.getAnswer();

        while(!isValidUser(user)){
            inputAsker.ask(UserServiceConstants.INVALID_USER);
            user = inputAsker.getAnswer();

            if(isQuitCommand(user))
                return "";
        }

        return user;
    }

    public boolean isQuitCommand(String user) {
        return UserServiceConstants.QUIT.equals(user.trim().toLowerCase());
    }


    public User getUserByLibraryNumber(String libraryNumber) {
        if(isValidUser(libraryNumber))
            return User.users.get(libraryNumber);

        return null;
    }
}
