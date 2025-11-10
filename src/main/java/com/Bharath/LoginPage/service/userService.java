package com.Bharath.LoginPage.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.Bharath.LoginPage.entity.User;
import com.Bharath.LoginPage.repository.userRepository;

public class userService {
    @Autowired
    private userRepository userRepo;

    public User registerUser(User user){
        return userRepo.save(user);        
    }

    public User loginUser(String email , String password){
        User user = userRepo.findByEmail(email);
        if(user != null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

}
