package com.nh7.ecommerce.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;
    @Column(name = "quantity")
    private int quantity;
    @OneToMany(mappedBy = "product")
    private List<Order> orderList;
    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @OneToOne(mappedBy = "product")
    private ProductDetails productDetails;
    @OneToOne(mappedBy = "product")
    private Post post;
}
