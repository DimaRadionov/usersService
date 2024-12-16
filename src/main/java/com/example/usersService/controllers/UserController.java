package com.example.usersService.controllers;

import com.example.usersService.models.User;
import com.example.usersService.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/users")
public class UserController {

    UserService userService = new UserService();

    @PostMapping
    public void save(User user){
        userService.save(user);
    }


}
