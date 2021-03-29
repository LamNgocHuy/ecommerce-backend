package com.nh7.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "shop")
public class Shop extends BaseEntity{

    @Column(name = "shop_address")
    private String shopAddress;
    @Column(name = "shop_phone_number")
    private String shopPhoneNumber;
    @Column(name = "shop_logo")
    private String shopLogo;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopPhoneNumber() {
        return shopPhoneNumber;
    }

    public void setShopPhoneNumber(String shopPhoneNumber) {
        this.shopPhoneNumber = shopPhoneNumber;
    }

    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
