package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookshop")
public class SignInSignUpController {

    @GetMapping("/signin")
    public String signIn(Model model) {
        return "signin";
    }

    @GetMapping("/signup")
    public String signUp(Model model) {
        return "signup";
    }

}
