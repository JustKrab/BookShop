package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenrePageController {

    private final AuthorService bookService;

    @Autowired
    public GenrePageController(AuthorService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/genres")
    public String genresPage() {
        return "genres/index";
    }
}
