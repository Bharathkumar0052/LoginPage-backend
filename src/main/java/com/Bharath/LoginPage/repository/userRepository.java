package com.Bharath.LoginPage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bharath.LoginPage.entity.User;

public interface userRepository extends JpaRepository<User,Long> {
    
}
