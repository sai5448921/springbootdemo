package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class User {

    private Long id;
    private String userName;
    private String token;
    private String password;
    private String mobilePhone;


}
