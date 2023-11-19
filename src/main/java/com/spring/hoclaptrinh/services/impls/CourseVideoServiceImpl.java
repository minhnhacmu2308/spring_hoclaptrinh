package com.spring.hoclaptrinh.services.impls;

import com.spring.hoclaptrinh.models.CourseVideo;
import com.spring.hoclaptrinh.repositories.CourseVideoRepository;
import com.spring.hoclaptrinh.services.CourseVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseVideoServiceImpl implements CourseVideoService {

    @Autowired
    private CourseVideoRepository courseVideoRepository;

    @Override
    public List<CourseVideo> getAll() {
        return courseVideoRepository.findAll();
    }

    @Override
    public Optional<CourseVideo> findById(int id) {
        return courseVideoRepository.findById(id);
    }

    @Override
    public CourseVideo save(CourseVideo courseVideo) {
        return courseVideoRepository.save(courseVideo);
    }

    @Override
    public void deleteById(int id) {
        courseVideoRepository.deleteById(id);
    }
}
