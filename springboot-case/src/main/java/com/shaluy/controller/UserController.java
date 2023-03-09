package com.shaluy.controller;

import com.shaluy.pojo.User;
import com.shaluy.service.UserService;
import com.shaluy.util.Result;
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
    public Result findAll(){
        List<User> allUsers = userService.findAllUsers();

        return Result.ok(allUsers);
    }

}
