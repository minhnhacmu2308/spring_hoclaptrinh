package com.spring.hoclaptrinh.services;

import com.spring.hoclaptrinh.models.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> getAll();
    Optional<Order> findById(int id);
    Order save(Order order);
    void deleteById(int id);
}
