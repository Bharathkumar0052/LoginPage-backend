package com.Bharath.LoginPage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bharath.LoginPage.entity.User;
import com.Bharath.LoginPage.repository.userRepository;
import com.Bharath.LoginPage.service.userService;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/Users")
public class userController {

    @Autowired
    private userService service;
    // private userRepository userRepo;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        service.registerUser(user);
        return "user registered successfully";
    }
    @PostMapping("/login")
    public String loginUser(@RequestBody User loginData) {
        User user = service.loginUser(loginData.getEmail(), loginData.getPassword());
        if (user != null) {
            return "Login successful! Welcome " + user.getName();
        } else {
            return "Invalid email or password.";
        }
    }

}
