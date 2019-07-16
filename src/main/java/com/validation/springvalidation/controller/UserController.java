package com.validation.springvalidation.controller;

import com.validation.springvalidation.domain.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @PostMapping("/user")
    public User userValidation(@Valid @RequestBody User user){
        return user;
    }
}
