package com.example.demo.repository;

import com.example.demo.entity.Todos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodosRepository extends CrudRepository<Todos, Integer> {
    Todos findById(int id);
}
