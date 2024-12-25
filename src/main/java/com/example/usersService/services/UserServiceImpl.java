package com.example.usersService.services;

import com.example.usersService.models.User;
import com.example.usersService.reposiroty.UserRepository;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    /*@Override
    public void addUser(@Param ("username") String username,
                        @Param ("email") String email,
                        @Param ("password") String password) {

    }*/


    @Override
    public void addUser(@Param ("user") User user) {
        userRepository.save(user);
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }
}
