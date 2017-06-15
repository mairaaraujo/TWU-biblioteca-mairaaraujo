package com.twu.services;

import com.twu.inputAsker.InputAsker;
import com.twu.user.User;

public class UserService {

    private InputAsker inputAsker;

    private static UserService instance = new UserService();

    public static UserService getInstance(){
        return instance;
    }

    public UserService() {
        this.inputAsker = InputAsker.getInstance();
    }

    public boolean isValidUser(String libraryNumber) {
        return User.users.containsKey(libraryNumber);
    }

    public boolean isValidPassword(User user, String password) {
        return  user.getPassword().equals(password);
    }


    public String askUserLogin() {
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

    public String askUserPassword(User user){
        inputAsker.ask(UserServiceConstants.USER_PASSWORD);
        String password = inputAsker.getAnswer();

        while(!isValidPassword(user, password)){
            inputAsker.ask(UserServiceConstants.INCORRECT_PASSWORD);
            password = inputAsker.getAnswer();

            if(isQuitCommand(password))
                return "";
        }
        return password;
    }

    public boolean login(){

        String libraryNumber = askUserLogin();
        if(!"".equals(libraryNumber)){
            User user = getUserByLibraryNumber(libraryNumber);
            String password = askUserPassword(user);
            if(!"".equals(password))
                return true;
        }

        return false;
    }

}
