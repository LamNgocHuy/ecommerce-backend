package com.example.demo.api;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeAPI {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    @GetMapping("/category")
    public Object getAllCategories(){
        return categoryService.getAll();
    }
    @PostMapping("/category")
    public Object createCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
        return category;
    }
    @GetMapping("/product")
    public Object getAllProducts(){
        return productService.getAll();
    }
    @PostMapping("/product")
    public Object createProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return product;
    }
}
