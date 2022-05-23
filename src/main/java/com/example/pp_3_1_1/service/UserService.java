package com.example.pp_3_1_1.service;

import com.example.pp_3_1_1.dao.UserRepositoru;
import com.example.pp_3_1_1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepositoru userRepositoru;

    public void addUpdateUser(User user) {
        userRepositoru.save(user);
    }

    public void removeUserById(long id) {
        userRepositoru.deleteById(id);
    }

    public User getUserById(long id) {
        User user= null;
        Optional<User> optional = userRepositoru.findById(id);
        if(optional.isPresent()){
        user = optional.get();}
        return user;
    }

    public List<User> getAllUsers() {
        return userRepositoru.findAll();
    }
}

