package com.example.WS_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WS_project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
