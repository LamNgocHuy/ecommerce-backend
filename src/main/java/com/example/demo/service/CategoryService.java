package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.rerpository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){return categoryRepository.findAll();}
    public void saveCategory(Category category){categoryRepository.save(category);}
}
