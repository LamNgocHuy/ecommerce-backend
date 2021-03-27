package com.nh7.ecommerce.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Post> post;
    @OneToMany(mappedBy = "user")
    private List<Comment> commentList;
    @OneToOne(mappedBy = "user")
    private Shop shop;
    @OneToOne(mappedBy = "user")
    private Cart cart;
}
