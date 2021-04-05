package com.example.MyBookShopApp.data.services;

import com.example.MyBookShopApp.data.entityes.Author;
import com.example.MyBookShopApp.data.entityes.Book;

public class DTO {
    private final Book book;
    private final Author author;

    public DTO(Book book, Author author) {
        this.book = book;
        this.author = author;
    }

    public Book getBook() {
        return book;
    }

    public Author getAuthor() {
        return author;
    }


}
