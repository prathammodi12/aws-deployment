package com.example.demo.controller;

//import com.example.demo.model.User;
//import com.example.demo.service.UserService;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

  //  private UserService userService;

//    UserController(UserService userService){
//        this.userService = userService;
//    }

    @GetMapping
    public String hello() {
        return "Hello Java Users welcome to the javaa";
    }

    @GetMapping("/role")
    public String getUserRole(){
        return "You are Admin!";
    }

//    @PostMapping("/save")
//    public User saveUser(@RequestBody User user) {
//        return userService.saveUser(user);
//    }
//
//    @GetMapping("/fetch")
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteUser(@PathVariable Long id) {
//        userService.deleteUser(id);
//    }
}
