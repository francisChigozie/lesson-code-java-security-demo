package com.ironhack.demosecurityjwt.controllers;

import com.ironhack.demosecurityjwt.models.User;

import java.util.List;

/**
 * Interface for UserController. Contains methods for handling user related operations
 */
public interface UserController {
    /**
     * Retrieves a list of all users
     *
     * @return list of all users
     */
    List<User> getUsers();

    /**
     * Saves a new user
     *
     * @param user the user to be saved
     * @return the saved user
     */
    User saveUser(User user);
}
