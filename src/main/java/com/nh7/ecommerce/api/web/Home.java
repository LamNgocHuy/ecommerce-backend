package com.nh7.ecommerce.api.web;

import com.nh7.ecommerce.entity.Category;
import com.nh7.ecommerce.entity.Product;
import com.nh7.ecommerce.service.CategoryService;
import com.nh7.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home/api")
public class Home {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public Object getCategories(){
        return this.categoryService.findAll();
    }
    @RequestMapping(value = "/category/{name}", method = RequestMethod.GET)
    public Object getCategoriesByName(@PathVariable(value="name")String name){
        return categoryService.findByName(name);
    }
    @RequestMapping(value = "/product/{category_name}", method = RequestMethod.GET)
    public List<Product> getProductsByCategoryName(@PathVariable(value="category_name")String categoryName){
        return productService.getProductByCategoryName(categoryName);
    }
    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public Object addNewCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
        return category;
    }
}
