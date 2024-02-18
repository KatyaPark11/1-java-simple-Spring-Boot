package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private Date creationDate;
    private String text;
    private Integer likes;

    public Post() {
    }

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
