package com.ironhack.demosecurityjwt.controllers.impl;

import com.ironhack.demosecurityjwt.controllers.GreetController;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greet")
public class GreetControllerImpl implements GreetController {

    @GetMapping
    @Override
    public String greet() {
        var authentication = SecurityContextHolder.getContext().getAuthentication();
        return "hello " + authentication.getName();
    }
}
