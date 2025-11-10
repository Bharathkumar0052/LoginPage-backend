package com.Bharath.LoginPage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bharath.LoginPage.entity.User;
import com.Bharath.LoginPage.repository.userRepository;

@RestController
@RequestMapping("api/Users")
public class userController {

    @Autowired
    private userRepository repo;
    @GetMapping
    public List<User> getAllUsers(){
        return repo.findAll();     
    }
    
}
