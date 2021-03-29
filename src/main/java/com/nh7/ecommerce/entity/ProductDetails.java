package com.nh7.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "product_details")
public class ProductDetails extends BaseEntity{

    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_thumbnail")
    private String productThumbnail;
    @Column(name = "product_price")
    private Float productPrice;
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductThumbnail() {
        return productThumbnail;
    }

    public void setProductThumbnail(String productThumbnail) {
        this.productThumbnail = productThumbnail;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
