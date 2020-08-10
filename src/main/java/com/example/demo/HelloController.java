package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "Hello Spring Boot!\nI am 硅谷课堂！";
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name",defaultValue = "World") String name) {
        return String.format("Hello %s!",name);
    }
}
