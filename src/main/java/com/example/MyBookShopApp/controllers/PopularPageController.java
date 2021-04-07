package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookshop")
public class PopularPageController {

    private final AuthorService bookService;

    @Autowired
    public PopularPageController(AuthorService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/popular")
    public String popular(Model model) {
        model.addAttribute("popularBooks", bookService.getPopularBooksAndAuthors());
        return "popular";
    }
}
