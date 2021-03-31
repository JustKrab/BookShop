package com.example.MyBookShopApp.data.repos;

import com.example.MyBookShopApp.data.entityes.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.MyBookShopApp.data.entityes.Author;

import java.util.List;


public interface AuthorRepository extends JpaRepository<Author,Integer> {

    Author findAuthorById(Integer id);
    List<Author> findAuthorByBook(Book book);

}
