package com.twu.services;

import com.twu.user.User;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserServiceTest {


    @Test
    public void shouldNotAcceptInvalidUser() throws Exception {
        UserService userService = new UserService();
        String libraryNumber = "000-0000";
        assertFalse(userService.isValidUser(libraryNumber));
    }

    @Test
    public void shouldAcceptValidUser() throws Exception {
        UserService userService = new UserService();
        String libraryNumber = "001-1000";
        assertTrue(userService.isValidUser(libraryNumber));
    }

    @Test
    public void shouldNotAcceptWrongPassword() throws Exception {
        UserService userService = new UserService();
        User user = User.users.get("001-1000");
        String password = "etc";

        assertFalse(userService.isValidPassword(user, password));
    }

    @Test
    public void shouldAcceptCorrectPassword() throws Exception {
        UserService userService = new UserService();
        User user = User.users.get("001-1000");
        String password = "password";

        assertTrue(userService.isValidPassword(user, password));
    }

    @Test
    public void name() throws Exception {
    }
}
