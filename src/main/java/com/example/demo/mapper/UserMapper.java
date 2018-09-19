package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Results(id = "userMap", value = {
            @Result(id=true, column = "id", property = "id"),
            @Result(column = "username", property = "userName"),
            @Result(column = "password", property = "password"),
            @Result(column = "token", property = "token"),
            @Result(column = "mobile_phone", property = "mobilePhone")
    })
    @Select("select * from user")
    List<User> findAll();


    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO user (username, password,token,mobile_phone) VALUES (#{userName}, #{password}, #{token},#{mobilePhone})")
    int addUserGeneratedKey(User user);

}
