package com.example.usersService.services;

import com.example.usersService.models.User;


public interface UserService{
    void addUser(User user);
    User findById(int id);
    void update (User user);
    void delete(User user);
}
