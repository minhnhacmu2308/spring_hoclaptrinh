package com.spring.hoclaptrinh.services;

import com.spring.hoclaptrinh.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();
    Optional<User> findById(int id);
    User save(User user);
    void deleteById(int id);
}
