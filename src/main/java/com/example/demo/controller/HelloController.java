package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello Java Users welcome to the board";
    }

    @GetMapping("/role")
    public String getUserRole(){
        return "You are Admin!";
    }
}
