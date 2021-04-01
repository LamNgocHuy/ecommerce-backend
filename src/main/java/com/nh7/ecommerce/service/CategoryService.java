package com.nh7.ecommerce.service;

import com.nh7.ecommerce.entity.Category;
import com.nh7.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    List<Category> findAll(){
        return (List<Category>) categoryRepository.findAll();
    }
}
