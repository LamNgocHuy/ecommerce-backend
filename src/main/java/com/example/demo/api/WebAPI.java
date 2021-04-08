package com.example.demo.api;

import com.example.demo.entity.TodoDetails;
import com.example.demo.entity.Todos;
import com.example.demo.repository.TodoDetailsRepository;
import com.example.demo.repository.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WebAPI {
    @Autowired
    private TodosRepository todosRepository;
    @Autowired
    private TodoDetailsRepository todoDetailsRepository;
    @GetMapping("/todos")
    public ResponseEntity<List<Todos>> getAllTodos(){
        return new ResponseEntity<>(todosRepository.findAll(), HttpStatus.OK);
    }
    @PostMapping("/todos")
    public ResponseEntity<Todos> createTutorial(@RequestBody Todos todos) {
        try {
            Todos _todos = todosRepository.save(todos);
            return new ResponseEntity<>(_todos, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
