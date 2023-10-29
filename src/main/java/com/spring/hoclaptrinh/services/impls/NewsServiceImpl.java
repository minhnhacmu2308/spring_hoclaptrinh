package com.spring.hoclaptrinh.services.impls;

import com.spring.hoclaptrinh.models.News;
import com.spring.hoclaptrinh.repositories.NewsRepository;
import com.spring.hoclaptrinh.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public List<News> getAll() {
        return newsRepository.findAll();
    }

    @Override
    public Optional<News> findById(int id) {
        return newsRepository.findById(id);
    }

    @Override
    public News save(News news) {
        return newsRepository.save(news);
    }

    @Override
    public void deleteById(int id) {
        newsRepository.deleteById(id);
    }
}
