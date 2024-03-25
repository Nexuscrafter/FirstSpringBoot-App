package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "<b>Hello world</b>";
    }

    @GetMapping("/home")
    public String home(){
        return "Welcome home";
    }

    @GetMapping("/test")
    public String getTest(){
        return "testing";
    }


}
