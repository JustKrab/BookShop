package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.services.AuthorService;
import com.example.MyBookShopApp.data.services.DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class BooksController {

    private final AuthorService bookService;

    @Autowired
    public BooksController(AuthorService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("allBooks")
    public List<DTO> allBooks() {
        return bookService.getAllBooksAndAuthors();
    }


    @ModelAttribute("recommendedBooks")
    public List<DTO> recommendedBooks() {
        return bookService.getRecommendedBooksAndAuthors();
    }

    @ModelAttribute("recentBooks")
    public List<DTO> recentBooks() {
        return bookService.getRecentBooksAndAuthors();
    }

    @ModelAttribute("popularBooks")
    public List<DTO> popularBooks() {
        return bookService.getPopularBooksAndAuthors();
    }
}
