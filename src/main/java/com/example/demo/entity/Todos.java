package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="todos")
public class Todos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "date")
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TodoDetails getTodoDetails() {
        return todoDetails;
    }

    public void setTodoDetails(TodoDetails todoDetails) {
        this.todoDetails = todoDetails;
    }

    @OneToOne(mappedBy = "todos")
    private TodoDetails todoDetails;
}
