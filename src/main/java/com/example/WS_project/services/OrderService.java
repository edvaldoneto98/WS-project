package com.example.WS_project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WS_project.entities.Order;
import com.example.WS_project.repositories.OrderRespository;

@Service
public class OrderService {

    @Autowired
    private OrderRespository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
    Optional<Order> obj = orderRepository.findById(id);
    return obj.get();
    }
}
