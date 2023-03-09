package com.shaluy.service.impl;

import com.shaluy.dao.UserDao;
import com.shaluy.entities.User;
import com.shaluy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUsers() {
        List<User> allUser = userDao.findAll();

        return allUser;
    }

    @Override
    public User findUserById(Long id) {
        User user = userDao.getOne(id);

        return user;
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userDao.deleteById(id);
    }
}
