package com.nh7.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "product_details")
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_details_id")
    private int productDetailsId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_thumbnail")
    private String productThumbnail;
    @Column(name = "product_price")
    private Float productPrice;
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
