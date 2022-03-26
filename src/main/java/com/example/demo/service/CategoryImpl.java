package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryImpl implements CategoryService {
    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public Optional<Category> findByTag(String tag) {
        return categoryRepo.findByTag(tag);
    }
}
