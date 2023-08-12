package com.ironhack.demosecurityjwt.controllers.impl;

import com.ironhack.demosecurityjwt.dtos.RoleToUserDto;
import com.ironhack.demosecurityjwt.controllers.RoleController;
import com.ironhack.demosecurityjwt.models.Role;
import com.ironhack.demosecurityjwt.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * RESTful API for Role management
 */
@RestController
@RequestMapping("/api/v1/roles")
@RequiredArgsConstructor
public class RoleControllerImpl implements RoleController {

    /**
     * User service for accessing user data
     */
    private final UserService userService;

    /**
     * Save a new role
     *
     * @param role role to be saved
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveRole(@RequestBody Role role) {
        userService.saveRole(role);
    }

    /**
     * Add a role to a user
     *
     * @param roleToUserDTO DTO containing the username and role name
     */
    @PostMapping("addtouser")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addRoleToUser(@RequestBody RoleToUserDto roleToUserDTO) {
        userService.addRoleToUser(roleToUserDTO.getUsername(), roleToUserDTO.getRoleName());
    }
}
