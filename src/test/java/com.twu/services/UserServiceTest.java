package com.twu.services;

import com.twu.inputAsker.InputAsker;
import com.twu.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {


    @Mock
    InputAsker inputAsker;

    @InjectMocks
    UserService userService;

    @Test
    public void shouldNotAcceptInvalidUser() throws Exception {
        String libraryNumber = "000-0000";
        assertFalse(userService.isValidUser(libraryNumber));
    }

    @Test
    public void shouldAcceptValidUser() throws Exception {
        String libraryNumber = "001-1000";
        assertTrue(userService.isValidUser(libraryNumber));
    }

    @Test
    public void shouldNotAcceptWrongPassword() throws Exception {
        User user = User.users.get("001-1000");
        String password = "etc";

        assertFalse(userService.isValidPassword(user, password));
    }

    @Test
    public void shouldAcceptCorrectPassword() throws Exception {
        User user = User.users.get("001-1000");
        String password = "password";

        assertTrue(userService.isValidPassword(user, password));
    }

    @Test
    public void isntQuitCommand() throws Exception {
        String input = "random command";

        assertFalse(userService.isQuitCommand(input));
    }

    @Test
    public void isQuitCommand() throws Exception {
        String input = "   qUit      ";

        assertTrue(userService.isQuitCommand(input));
    }

    @Test
    public void getUserByInvalidLibraryNumber() throws Exception {

        String libraryNumber = "00000";
        assertNull(userService.getUserByLibraryNumber(libraryNumber));
    }

    @Test
    public void getUserByValidLibraryNumber() throws Exception {

        String libraryNumber = "001-1000";
        assertNotNull(userService.getUserByLibraryNumber(libraryNumber));
    }

    @Test
    public void verifyUserByValidLibraryNumber() throws Exception {

        String libraryNumber = "001-1000";
        assertEquals(User.users.get(libraryNumber), userService.getUserByLibraryNumber(libraryNumber));

    }

    @Test
    public void askUserLogin() throws Exception {
        userService.askUserLogin(inputAsker);
    }
}
