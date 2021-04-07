package com.example.demo.repository;

import com.example.demo.entity.TodoDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoDetailsRepository extends CrudRepository<TodoDetails,Integer> {
    TodoDetails findById(int id);
}
