package com.spring.hoclaptrinh.services;

import com.spring.hoclaptrinh.models.Course;
import com.spring.hoclaptrinh.models.News;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CourseService {
    List<Course> getAll();
    Optional<Course> findById(int id);
    Course save(Course course);
    void deleteById(int id);
}
