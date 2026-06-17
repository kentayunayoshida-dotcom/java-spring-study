package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.UserService;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    // ログイン画面表示
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // 登録画面表示
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    // ユーザー登録処理
    @PostMapping("/register")
    public String register(@RequestParam String username,
                           @RequestParam String password) {

        userService.register(username, password);

        return "redirect:/login";
    }
}