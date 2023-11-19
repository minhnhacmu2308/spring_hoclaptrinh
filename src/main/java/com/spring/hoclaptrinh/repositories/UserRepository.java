package com.spring.hoclaptrinh.repositories;

import com.spring.hoclaptrinh.models.Course;
import com.spring.hoclaptrinh.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
