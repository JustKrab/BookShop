package com.example.MyBookShopApp.controllers;


import com.example.MyBookShopApp.data.AuthorService;
import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/bookshop")
public class MainPageController {

    private final BooksService booksService;
    private final AuthorService authorService;

    @Autowired
    public MainPageController(BooksService booksService,AuthorService authorService) {
        this.booksService = booksService;
        this.authorService=authorService;
    }


    @ModelAttribute("bookData")
    public List<Book> bookData(){
        return booksService.getBooksData();
    }

    @GetMapping("/main")
    public String mainPage(){
//        model.addAttribute("bookData",booksService.getBooksData());
//        model.addAttribute("searchPlaceHolder","new search placeHolder");
//        model.addAttribute("serverTime",new Date());
//        model.addAttribute("placeholderTextPart2","SERVER");
//        model.addAttribute("messageTemplate","search.placeholder2");
        return "index";
    }

    @GetMapping("/genres")
    public String genresPage(){
        return "genres";
    }

    @GetMapping("/authors")
    public String authorsPage(Model model) {
        model.addAttribute("letters", authorService.getAuthorsAlphabetData());
        model.addAttribute("authors", authorService.getAuthorsData());
//        model.addAttribute("authors",authorService.getAuthorsMap());
        return "authors";
    }

    @GetMapping("/recent")
    public String newPage(){
        return "recent";
    }

    @GetMapping("/popular")
    public String popularPage(){
        return "popular";
    }

    @GetMapping("/cart")
    public String cartPage(){
        return "cart";
    }


    @GetMapping("/signin")
    public String singInPage(){
        return "signin";
    }


    @GetMapping("/contacts")
    public String contactsPage(){
        return "contacts";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @GetMapping("/faq")
    public String faqPage(){
        return "faq";
    }

    @GetMapping("/signup")
    public String singUpPage(){
        return "signup";
    }

    @GetMapping("/postponed")
    public String postponedPage(){
        return "postponed";
    }

    @GetMapping("/documents")
    public String documentsPage(){
        return "/documents/index";
    }

}