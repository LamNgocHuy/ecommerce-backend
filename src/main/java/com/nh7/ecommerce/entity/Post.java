package com.nh7.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private int postId;
    @Column(name = "post_title")
    private String postTitle;
    @Column(name = "post_decription")
    private String postDecription;
    @Column(name = "post_avg_evalute")
    private Float postAvgEvalute;
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
