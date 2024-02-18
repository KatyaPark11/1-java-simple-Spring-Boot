package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> _posts = new ArrayList<>();

    public List<Post> listAllPosts() {
        return _posts;
    }

    public void create(String text) {
        _posts.add(new Post((long)_posts.size(), text, new Date()));
    }
}
