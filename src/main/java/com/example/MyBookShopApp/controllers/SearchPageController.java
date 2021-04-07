package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookshop")
public class SearchPageController {

    @GetMapping("/search")
    public String search(Model model) {
        return "search/index";
    }

}
