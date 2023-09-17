package com.hallo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/good")
    public String hello(){
        return "Welcome to RaiseTech！";
    }
}
