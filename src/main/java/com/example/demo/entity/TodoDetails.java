package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "todo_details")
public class TodoDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "decription")
    private String decription;
    @Column(name = "due_time")
    private String dueTime;
    @OneToOne
    @JoinColumn(name = "todo_id")
    private Todos todos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getDueTime() {
        return dueTime;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }

    public Todos getTodos() {
        return todos;
    }

    public void setTodos(Todos todos) {
        this.todos = todos;
    }

    public TodoDetails() {
    }

    public TodoDetails(int id, String decription, String dueTime, Todos todos) {
        this.id = id;
        this.decription = decription;
        this.dueTime = dueTime;
        this.todos = todos;
    }
}
