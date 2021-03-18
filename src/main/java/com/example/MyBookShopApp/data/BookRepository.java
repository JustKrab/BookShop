package com.example.MyBookShopApp.data;

import com.example.MyBookShopApp.data.entityes.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findBooksByAuthor_Author(String author);

    @Query("from Book")
    List<Book> customFindAllBooks();
}
