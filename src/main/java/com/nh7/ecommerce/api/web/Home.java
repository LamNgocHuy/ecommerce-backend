package com.nh7.ecommerce.api.web;

import com.nh7.ecommerce.entity.Category;
import com.nh7.ecommerce.entity.Product;
import com.nh7.ecommerce.service.CategoryService;
import com.nh7.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/home/api")
public class Home {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;
    @GetMapping("/category")
    public List<Category> getCategories(){
        return categoryService.findAll();
    }
    @GetMapping("/category/{name}")
    public List<Category> getCategoriesByName(@PathVariable(value="name")String name){
        return categoryService.findByName(name);
    }
    @GetMapping("/product/{category_name}")
    public List<Product> getProductsByCategoryName(@PathVariable(value="category_name")String categoryName){
        return productService.getProductByCategoryName(categoryName);
    }
    @GetMapping("/category/addnew")
    public Object addNewCategory(){
        Category category = new Category();
        category.setCategoryName("duoc luon");
        category.setCategoryThumbnail("ok chua");
        categoryService.saveCategory(category);
        return category;
    }
}
