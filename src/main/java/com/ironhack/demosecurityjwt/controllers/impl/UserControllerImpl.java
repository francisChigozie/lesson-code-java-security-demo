package com.ironhack.demosecurityjwt.controllers.impl;

import com.ironhack.demosecurityjwt.controllers.UserController;
import com.ironhack.demosecurityjwt.models.User;
import com.ironhack.demosecurityjwt.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

/**
 * RESTful API for User management
 */
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    /**
     * User service for accessing user data
     */
    private final UserService userService;

    /**
     * Get a list of all users
     *
     * @return list of all users
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers() {
        return userService.getUsers();
    }

    /**
     * Save a new user
     *
     * @param user the user to be saved
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }


    @GetMapping("me")
    public User getMine(){
        return userService.getUserByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
    }
}
