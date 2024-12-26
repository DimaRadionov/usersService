package com.example.usersService.controllers;

import com.example.usersService.models.User;
import com.example.usersService.services.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
@Slf4j
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping
    public void addUser(@RequestBody User user){
        userServiceImpl.addUser(user);
    }

    @GetMapping
    public Optional<User> getUser(@RequestParam Long id){
        return userServiceImpl.findById(id);
    }

}
