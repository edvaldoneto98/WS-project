package com.example.WS_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WS_project.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
