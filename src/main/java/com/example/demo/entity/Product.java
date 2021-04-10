package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column
    private int id;
    @Column
    @Getter
    @Setter
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id")
    @Getter
    @Setter
    private Category category;
}
