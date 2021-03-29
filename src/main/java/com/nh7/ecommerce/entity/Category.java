package com.nh7.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category extends BaseEntity{
    @Column(name = "category_name")
    private String categoryName;
    @OneToOne(mappedBy = "category")
    private Product product;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
