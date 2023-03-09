package com.shaluy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpringBootController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringBoot(){
        return "hello springboot!";
    }
}
