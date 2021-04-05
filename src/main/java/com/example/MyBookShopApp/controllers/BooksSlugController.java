package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BooksSlugController {

    private final AuthorService bookService;

    @Autowired
    public BooksSlugController(AuthorService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book/{slug}")
    public String getBook(@PathVariable("slug") String slug, Model model) {
        model.addAttribute("bookBySlug", bookService.getBookBySlug(slug));
        return "books/slug";
    }
}
