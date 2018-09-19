package com.example.demo.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.properties.ConstBean;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private ConstBean constBean;

    @Resource
    private UserService userService;

    @RequestMapping("/index")
    public String test(){
        List<User> userList = userService.findAll();
        return "Spring boot " + constBean.getName() + constBean.getAge();
    }


    @RequestMapping("/add")
    public String testAdd(){
        User user = new User();
        user.setMobilePhone("18620885643");
        user.setPassword("abcd");
        user.setToken("abcdef");
        user.setUserName("mada");
        userService.add(user);
        return JSON.toJSONString(user);
    }
}
