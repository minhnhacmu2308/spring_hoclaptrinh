package com.spring.hoclaptrinh.controllers;

import com.spring.hoclaptrinh.models.User;
import com.spring.hoclaptrinh.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable int id) {
        return userService.findById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User updatedUser) {
        User existingUser = userService.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setFullName(updatedUser.getFullName());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setPassword(updatedUser.getPassword());
            existingUser.setPhoneNumber(updatedUser.getPhoneNumber());
            existingUser.setAddress(updatedUser.getAddress());
            existingUser.setGender(updatedUser.getGender());
            existingUser.setStatus(updatedUser.getStatus());
            existingUser.setRole(updatedUser.getRole());
            // Update other attributes as needed
            return userService.save(existingUser);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteById(id);
    }
}
