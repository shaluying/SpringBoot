package com.shaluy.service.impl;

import com.shaluy.dao.UserMapper;
import com.shaluy.pojo.User;
import com.shaluy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<User> findAllUsers() {
        //从缓存中查询数据  规定存储用户信息使用string类型进行存储, 存储的key就是userList
        List<User> userList = (List<User>) redisTemplate.boundValueOps("userList").get();

        if(userList==null){
            //没有查询到数据说明是第一次查询, 查询数据库
            userList = userMapper.selectAll();
            //将查询到的数据放入缓存
            redisTemplate.boundValueOps("userList").set(userList);
            System.out.println("从数据库中查询...");
        }else {
            System.out.println("从缓存中查询.....");
        }

        //如果缓存中有数据, 直接返回
        return userList ;
    }

    @Override
    public User findUserById(Long id) {
        User user = userMapper.selectByPrimaryKey(id);

        return user;
    }

    @Override
    public void saveUser(User user) {
        int insert = userMapper.insert(user);
    }

    @Override
    public void deleteUserById(Long id) {
        int i = userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateUser(User user) {
        int i = userMapper.updateByPrimaryKey(user);
    }
}
