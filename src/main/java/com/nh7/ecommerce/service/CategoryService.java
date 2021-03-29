package com.nh7.ecommerce.service;

import com.nh7.ecommerce.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class HomeService {
    @Autowired
    private HomeRepository homeRepository;
    public List<Category> findAll(){
        return homeRepository.findAll();
    }
}
