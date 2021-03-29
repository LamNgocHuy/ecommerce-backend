package com.nh7.ecommerce.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product extends BaseEntity{

    @Column(name = "quantity")
    private int quantity;
    @OneToMany(mappedBy = "product")
    private List<Order> orderList;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @OneToOne(mappedBy = "product")
    private ProductDetails productDetails;
    @OneToOne(mappedBy = "product")
    private Post post;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
