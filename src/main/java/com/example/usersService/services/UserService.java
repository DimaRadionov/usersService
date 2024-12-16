package com.example.usersService.services;

import com.example.usersService.models.User;
import com.example.usersService.reposiroty.UserDAOImpl;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class UserService {
    UserDAOImpl userDAOImpl = new UserDAOImpl();

    public User findUserById(int id){
        return userDAOImpl.findById(id);
    }

    public void save(User user){
        userDAOImpl.save(user);
    }

}
