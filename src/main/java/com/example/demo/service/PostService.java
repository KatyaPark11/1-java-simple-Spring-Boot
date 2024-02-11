package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("Первый постик"));
        posts.add(new Post("Второй постик"));
        posts.add(new Post("Третий постик"));
        return posts;
    }
}
