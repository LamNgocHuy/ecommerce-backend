package com.nh7.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post extends BaseEntity{

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

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostDecription() {
        return postDecription;
    }

    public void setPostDecription(String postDecription) {
        this.postDecription = postDecription;
    }

    public Float getPostAvgEvalute() {
        return postAvgEvalute;
    }

    public void setPostAvgEvalute(Float postAvgEvalute) {
        this.postAvgEvalute = postAvgEvalute;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
