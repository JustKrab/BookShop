package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookshop")
public class FooterController {

    @GetMapping("/about")
    public String about(Model model){
        return ("about");
    }
    @GetMapping("/documents")
    public String documents(Model model){
        return ("/documents/index");
    }
    @GetMapping("/faq")
    public String faq(Model model){
        return ("faq");
    }
    @GetMapping("/contacts")
    public String contacts(Model model){
        return ("contacts");
    }
}
