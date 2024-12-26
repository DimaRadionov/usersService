package com.example.usersService.controllers;

import com.example.usersService.models.User;
import com.example.usersService.services.UserService;
import com.example.usersService.services.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.rmi.server.LogStream.log;

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


}
