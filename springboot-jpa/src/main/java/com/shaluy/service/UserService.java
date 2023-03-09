package com.shaluy.service;


import com.shaluy.entities.User;

import java.util.List;

public interface UserService {

    //查询所有User
    List<User> findUsers();

    //根据id查询User
    User findUserById(Long id);

    //保存User
    void saveUser(User user);

    //更新User
    void updateUser(User user);

    //根据id删除User
    void deleteUserById(Long id);
}
