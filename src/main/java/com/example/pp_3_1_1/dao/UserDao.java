package com.example.pp_3_1_1.dao;


import com.example.pp_3_1_1.entity.User;

import java.util.List;


public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    User getUserById(long id);

    List<User> getAllUsers();
}

