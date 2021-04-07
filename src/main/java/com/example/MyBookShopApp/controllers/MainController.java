package com.example.MyBookShopApp.controllers;



import com.example.MyBookShopApp.data.services.AuthorService;
import com.example.MyBookShopApp.data.services.DTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
;import java.util.List;

@Controller
@RequestMapping("/bookshop")
public class MainController {
    private Logger logger = LoggerFactory.getLogger(MainController.class);


    private final AuthorService bookService;

    @Autowired
    public MainController(AuthorService bookService) {
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

    @GetMapping("/main")
    public String mainPage() {
        return "index";
    }

}