package com.spring.hoclaptrinh.repositories;

import com.spring.hoclaptrinh.models.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {
}
