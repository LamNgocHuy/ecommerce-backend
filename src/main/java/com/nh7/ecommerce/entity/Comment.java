package com.nh7.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment extends BaseEntity{

    @Column(name = "comment_content")
    private String commentContent;
    @Column(name = "comment_evalute")
    private int commentEvalute;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public int getCommentEvalute() {
        return commentEvalute;
    }

    public void setCommentEvalute(int commentEvalute) {
        this.commentEvalute = commentEvalute;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
