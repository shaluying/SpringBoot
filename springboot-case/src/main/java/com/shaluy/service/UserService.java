package com.shaluy.service;

import com.shaluy.pojo.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();
    User  findUserById(Long id);

    void saveUser(User user);

    void deleteUserById(Long id);

    void updateUser(User user);

}
