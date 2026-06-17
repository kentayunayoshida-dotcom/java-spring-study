package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Post;
import com.example.demo.entity.User;
import com.example.demo.repository.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    // 投稿保存
    public void save(String content, User user) {
        Post post = new Post();
        post.setContent(content);
        post.setUser(user);

        postRepository.save(post);
    }

    // 全投稿取得
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    // 投稿削除
    public void delete(Long id) {
        postRepository.deleteById(id);
    }
}