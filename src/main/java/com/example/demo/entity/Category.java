package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column
    private int id;
    @Column
    @Getter
    @Setter
    private String name;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    @Getter
    @Setter
    private List<Product> productList;
}
