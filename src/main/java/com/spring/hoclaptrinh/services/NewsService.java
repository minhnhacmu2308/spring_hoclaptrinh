package com.spring.hoclaptrinh.services;

import com.spring.hoclaptrinh.models.News;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface NewsService {
    List<News> getAll();
    Optional<News> findById(int id);
    News save(News news);
    void deleteById(int id);
}
