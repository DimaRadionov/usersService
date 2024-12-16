package com.example.usersService.reposiroty;

import com.example.usersService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserDAO{
    void save(User user);
    User findById(int id);
    void update (User user);
    void delete(User user);
}
