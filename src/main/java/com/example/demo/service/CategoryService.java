package com.example.demo.service;

import com.example.demo.model.Category;

import java.util.Optional;

public interface CategoryService {
    Optional<Category> findByTag(String tag);

}
