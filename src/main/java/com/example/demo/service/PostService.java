package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("Первый постик", new Date()));
        posts.add(new Post("Второй постик", new Date()));
        posts.add(new Post("Третий постик", new Date()));
        return posts;
    }
}
