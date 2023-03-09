package com.shaluy.controller;

import com.shaluy.entities.User;
import com.shaluy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAllUser(){
        List<User> users = userService.findUsers();

        return users;
    }

    @RequestMapping("/save")
    @ResponseBody
    public String saveUser(){
        User user = new User();
        user.setName("zhangsan");
        user.setUsername("aaa");
        user.setPassword("bbb");

        userService.saveUser(user);

        return "success！";
    }

}
