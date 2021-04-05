package com.example.MyBookShopApp.controllers;


import com.example.MyBookShopApp.data.services.AuthorService;
import com.example.MyBookShopApp.data.entityes.Book;
import com.example.MyBookShopApp.data.services.DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/bookshop")
public class MainController {



    private final AuthorService bookService;

    @Autowired
    public MainController(AuthorService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/main")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/genres")
    public String genresPage(){
        return "genres";
    }



    @GetMapping("/recent")
    public String RecentPage(){
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
