package com.example.PhotoAppApiUser.ui.controller;

import com.example.PhotoAppApiUser.ui.model.CreateUserRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private Environment env;

    @GetMapping("/status/check")
    public String status(){
        return "working on port:" + env.getProperty("local.server.port");
    }

    @PostMapping
    public String createUser(@Valid @RequestBody CreateUserRequestModel user){
        return "create a user";
    }
}
