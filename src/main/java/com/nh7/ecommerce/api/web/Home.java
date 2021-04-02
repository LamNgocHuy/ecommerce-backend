package com.nh7.ecommerce.api.web;

import com.nh7.ecommerce.entity.Category;
import com.nh7.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/home/api")
public class Home {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/category")
    public List<Category> getCategories(){
        return categoryService.findAll();
    }
    @GetMapping("/category/{name}")
    public List<Category> getCategoriesByName(@PathVariable(value="name")String name){
        return categoryService.findByName(name);
    }
}
