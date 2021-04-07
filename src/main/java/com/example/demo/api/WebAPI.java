package com.example.demo.api;

import com.example.demo.entity.TodoDetails;
import com.example.demo.entity.Todos;
import com.example.demo.repository.TodoDetailsRepository;
import com.example.demo.repository.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class WebAPI {
    @Autowired
    private TodosRepository todosRepository;
    @Autowired
    private TodoDetailsRepository todoDetailsRepository;
    @GetMapping("/todos")
    public Object getAllTodos(){
        return todosRepository.findAll();
    }
    @PostMapping("/todos")
    public Object saveTodos(@RequestBody Todos todos){
        todosRepository.save(todos);
        return todos;
    }
    @GetMapping("/todos-details/{id}")
    public Object getTodoDetailsById(@PathVariable(value = "id")int id){
        return todoDetailsRepository.findById(id);
    }
    @PostMapping("/todos-details")
    public Object saveTodDetails(@RequestBody TodoDetails todoDetails){
        todoDetailsRepository.save(todoDetails);
        return todoDetails;
    }
}
