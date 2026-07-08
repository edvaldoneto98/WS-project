package com.example.WS_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WS_project.entities.Order;

public interface OrderRespository extends JpaRepository<Order, Long> {
    
}
