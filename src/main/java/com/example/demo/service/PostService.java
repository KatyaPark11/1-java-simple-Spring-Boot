package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    private ArrayList<Post> _posts = new ArrayList<>();

    public ArrayList<Post> listAllPosts() {
        return _posts;
    }

    public void create(String text) {
        _posts.add(new Post(text, new Date()));
    }
}
