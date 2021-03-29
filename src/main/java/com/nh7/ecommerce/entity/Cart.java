package com.nh7.ecommerce.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "cart", fetch = FetchType.LAZY)
    private List<Order> orderList;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
