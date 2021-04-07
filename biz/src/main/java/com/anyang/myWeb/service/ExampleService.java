package com.anyang.myWeb.service;

import com.anyang.myWeb.entity.user.User;
import com.anyang.myWeb.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

    @Autowired
    private UserService userService;

    public List<User> greet() {
       return userService.getAll();
    }
}
