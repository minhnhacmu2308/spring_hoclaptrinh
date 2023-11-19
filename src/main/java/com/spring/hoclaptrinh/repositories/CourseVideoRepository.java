package com.spring.hoclaptrinh.repositories;

import com.spring.hoclaptrinh.models.Course;
import com.spring.hoclaptrinh.models.CourseVideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseVideoRepository extends JpaRepository<CourseVideo, Integer> {
}
