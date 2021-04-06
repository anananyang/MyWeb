package com.anyang.myWeb.controller;

import com.anyang.myWeb.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("example")
public class Example {

    @Autowired
    private ExampleService exampleService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return exampleService.greet();
    }
}
