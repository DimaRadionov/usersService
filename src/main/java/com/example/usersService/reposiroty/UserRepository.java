package com.example.usersService.reposiroty;

import com.example.usersService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface UserRepository extends JpaRepository<User, Integer> {
    ArrayList<User> findAllUsers();
}
