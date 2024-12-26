package com.example.usersService.services;

import com.example.usersService.models.User;

import java.util.Optional;


public interface UserService{
    void addUser(User user);
    Optional<User> findById(Long id);
    void update (User user);
    void delete(User user);
}
