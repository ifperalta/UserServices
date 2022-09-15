package com.usermanagement.controllers;

import com.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "main-users/")
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userSerevice) {
        this.userService = userSerevice;
    }

}