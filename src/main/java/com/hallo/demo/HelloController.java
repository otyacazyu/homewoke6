package com.hallo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/良い１日を")
    public String hello(){
        return "良い１日をお過ごしください";
    }
}
