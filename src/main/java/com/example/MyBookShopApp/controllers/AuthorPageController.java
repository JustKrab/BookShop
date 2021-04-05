package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.entityes.Author;
import com.example.MyBookShopApp.data.repos.AuthorRepository;
import com.example.MyBookShopApp.data.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.util.Map;

@Controller
public class AuthorPageController {

    private final AuthorService authorsService;

    @Autowired
    public AuthorPageController(AuthorService authorsService) {
        this.authorsService = authorsService;
    }

    @ModelAttribute("authors")
    public Map<String, List<Author>> authors() {
        return authorsService.getAllAuthorsGrouped();
    }

    @GetMapping("/authors")
    public String authorsPage() {
        return "authors";
    }
}
