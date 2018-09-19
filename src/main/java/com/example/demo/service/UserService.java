package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;


    public List<User> findAll(){
        return userMapper.findAll();
    }

    @Transactional
    public void add(User user){
        userMapper.addUserGeneratedKey(user);
    }

}
