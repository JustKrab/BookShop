package com.example.MyBookShopApp.data.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.MyBookShopApp.data.entityes.Author;


public interface AuthorRepository extends JpaRepository<Author,Integer> {

    Author findAuthorById(Integer id);

}
