package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.entityes.Author;
import com.example.MyBookShopApp.data.services.AuthorService;
import com.example.MyBookShopApp.data.services.DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;

@Controller
public class AuthorSlugController {
    private final AuthorService service;

    @Autowired
    public AuthorSlugController(AuthorService service) {
        this.service = service;
    }

    @GetMapping("/authors/slug/{id}")
    public String getAuthor(@PathVariable Integer id, Model model) {
        Author author = service.getAuthorById(id);
        model.addAttribute("authorById", author);
        model.addAttribute("booksByAuthor", service.getBooksByAuthor(author));
        return "authors/slug";
    }

    @GetMapping("/books/author/{id}")
    public String booksByAuthor(@PathVariable Integer id, Model model) {
        Author author = service.getAuthorById(id);
        model.addAttribute("authorById", author);
        List<DTO> books = service.getBooksByAuthor(author);
        if (books.size() > 0) {
            model.addAttribute("booksByAuthor", service.getBooksByAuthor(author));
        } else {
            model.addAttribute("booksByAuthor", Collections.EMPTY_LIST);
        }
        return "books/author";
    }
}
