package com.example.usersService.controllers;

import com.example.usersService.models.User;
import com.example.usersService.services.UserService;
import com.example.usersService.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping
    public void addUser(@RequestBody User user){
        userServiceImpl.addUser(user);
    }


}
