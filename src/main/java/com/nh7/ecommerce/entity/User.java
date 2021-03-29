package com.nh7.ecommerce.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends BaseEntity{

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Post> post;
    @OneToMany(mappedBy = "user")
    private List<Comment> commentList;
    @OneToOne(mappedBy = "user")
    private Shop shop;
    @OneToOne(mappedBy = "user")
    private Cart cart;
    @ManyToMany
    @JoinTable(name="user_role",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="role_id")
    )
    private List<Role> roles=new ArrayList<>();
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserDetails userDetails;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getPost() {
        return post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
