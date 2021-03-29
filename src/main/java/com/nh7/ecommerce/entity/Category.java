package com.nh7.ecommerce.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class Category extends BaseEntity {
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "category_thumbnail")
    private String categoryThumbnail;
    @OneToMany(mappedBy = "category")
    private List<Product> productList=new ArrayList<>();

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryThumbnail() {
        return categoryThumbnail;
    }

    public void setCategoryThumbnail(String categoryThumbnail) {
        this.categoryThumbnail = categoryThumbnail;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
