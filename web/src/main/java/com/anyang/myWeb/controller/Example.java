package com.anyang.myWeb.controller;

import com.anyang.myWeb.config.MyWebConfig;
import com.anyang.myWeb.entity.user.User;
import com.anyang.myWeb.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("example")
public class Example {

    @Autowired
    private ExampleService exampleService;

    @RequestMapping("hello")
    @ResponseBody
    public List<User> hello() {
        return exampleService.greet();
    }
}
