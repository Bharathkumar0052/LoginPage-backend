package com.Bharath.LoginPage.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class User {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id;   
    @Column(nullable=false,unique=true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable=false)
    private String name;
    @CreationTimestamp
    @Column(name="created_date" ,nullable=false , updatable = false)
    private LocalDateTime createdDate;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", createdDate="
                + createdDate + "]";
    }
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
    public User(Long id, String email, String password, String name, LocalDateTime createdDate) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.createdDate = createdDate;
    }
    



             
}
