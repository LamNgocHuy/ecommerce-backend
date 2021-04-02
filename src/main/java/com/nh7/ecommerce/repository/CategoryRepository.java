package com.nh7.ecommerce.repository;

import com.nh7.ecommerce.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {
    Category findById(int id);
    List<Category> findByCategoryName(String var);
}
