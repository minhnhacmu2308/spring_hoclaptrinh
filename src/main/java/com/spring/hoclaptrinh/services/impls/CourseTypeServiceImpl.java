package com.spring.hoclaptrinh.services.impls;

import com.spring.hoclaptrinh.models.CourseType;
import com.spring.hoclaptrinh.repositories.CourseTypeRepository;
import com.spring.hoclaptrinh.services.CourseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseTypeServiceImpl implements CourseTypeService {

    @Autowired
    private CourseTypeRepository courseTypeRepository;

    @Override
    public List<CourseType> getAll() {
        return courseTypeRepository.findAll();
    }

    @Override
    public Optional<CourseType> findById(int id) {
        return courseTypeRepository.findById(id);
    }

    @Override
    public CourseType save(CourseType courseType) {
        return courseTypeRepository.save(courseType);
    }

    @Override
    public void deleteById(int id) {
        courseTypeRepository.deleteById(id);
    }
}
