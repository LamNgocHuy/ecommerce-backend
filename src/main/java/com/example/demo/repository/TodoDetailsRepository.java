package com.example.demo.repository;

import com.example.demo.entity.TodoDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoDetailsRepository extends JpaRepository<TodoDetails,Integer> {
    TodoDetails findById(int id);
}
