package com.anyang.myWeb.service;

import com.anyang.myWeb.entity.user.User;
import com.anyang.myWeb.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class ExampleService {

    @Autowired
    private UserService userService;



    public Map<String, Object> greet() {
        List<User> userList = userService.getAll();

        Map<String, Object> result = new TreeMap<>();
        result.put("userList", userList);

        return result;
    }
}
