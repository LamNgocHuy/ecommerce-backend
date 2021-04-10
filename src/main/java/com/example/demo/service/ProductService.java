package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.rerpository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){return productRepository.findAll();}
    public void saveProduct(Product product){
        productRepository.save(product);
    }
}
