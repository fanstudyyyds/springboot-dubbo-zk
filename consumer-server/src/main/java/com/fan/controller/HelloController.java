package com.fan.controller;

import com.fan.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference
    HelloService helloService;

    @RequestMapping("/hello")
    public String Hello(){
        return helloService.sayHello("Hello");
    }
}
