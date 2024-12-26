package com.example.usersService.repository;

import com.example.usersService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //@Query("INSERT INTO users (username, email, password) VALUES (:#{#user.username}, :#{#user.email}, :#{#user.password})")
    //User addUser(@Param("user") User user);

}
