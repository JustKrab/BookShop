package com.example.MyBookShopApp.data.repos;

import com.example.MyBookShopApp.data.entityes.Author;
import com.example.MyBookShopApp.data.entityes.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findBooksByAuthor_Author(Author author);

    @Query("from Book")
    List<Book> customFindAllBooks();
}
