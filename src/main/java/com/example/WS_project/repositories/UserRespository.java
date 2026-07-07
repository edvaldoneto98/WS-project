package com.example.WS_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WS_project.entities.User;

public interface UserRespository extends JpaRepository<User, Long> {
    
}
