package com.nh7.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_id")
    private int shopId;
    @Column(name = "shop_address")
    private String shopAddress;
    @Column(name = "shop_phone_number")
    private String shopPhoneNumber;
    @Column(name = "shop_logo")
    private String shopLogo;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
