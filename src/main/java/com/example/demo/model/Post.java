package com.example.demo.model;

import java.util.Date;

public class Post {
    private Date creationDate;
    private String text;
    private Integer likes;

    public Post(String text, Date creationDate) {
        this.creationDate = creationDate;
        this.text = text;
        this.likes = 0;
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
}
