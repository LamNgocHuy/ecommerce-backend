package com.nh7.ecommerce.service;

import com.nh7.ecommerce.entity.Category;
import com.nh7.ecommerce.repository.CategoryRepository;
import javafx.scene.chart.CategoryAxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> findAll(){
        return (List<Category>) categoryRepository.findAll();
    }
    public List<Category> findByName(String var){return categoryRepository.findByCategoryName(var);}
    public boolean saveCategory(Category category){
        try {
            categoryRepository.save(category);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public Category getCategoryById(int id){return categoryRepository.findById(id);}
}
