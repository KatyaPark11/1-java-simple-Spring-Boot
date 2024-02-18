package com.example.demo.model;

import java.util.Date;

public class Post {
    private Long id;
    private Date creationDate;
    private String text;
    private Integer likes;

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.creationDate = creationDate;
        this.text = text;
        this.likes = 0;
    }

    public Long getId() {
        return this.id;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public String getText() {
        return this.text;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
