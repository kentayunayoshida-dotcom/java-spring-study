package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.service.PostService;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    // ホーム画面（投稿一覧）
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("posts", postService.findAll());
        return "home";
    }

    // 投稿処理
    @PostMapping("/post")
    public String post(@RequestParam String content,
                       Authentication authentication) {

        User user = (User) authentication.getPrincipal();

        postService.save(content, user);

        return "redirect:/home";
    }

    // 投稿削除
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        postService.delete(id);
        return "redirect:/home";
    }
}