package com.example.MyBookShopApp.data;


import org.postgresql.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {


    private BookRepository bookRepository;

    @Autowired
    public BooksService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooksData() {
        return bookRepository.findAll();
    }

//    private JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public BooksService(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public List<Book> getBooksData() {
//        List<Book> books = jdbcTemplate.query("SELECT * FROM books", (ResultSet rs, int rowNum) -> {
//            Book book = new Book();
//            book.setId(rs.getInt("id"));
//            book.setAuthor(getAuthorByAuthorId(rs.getInt("author_id")));
//            book.setTitle(rs.getString("title"));
//            book.setPriceOld(rs.getString("price_old"));
//            book.setPrice(rs.getString("price"));
//            return book;
//        });
//        return new ArrayList<>(books);
//    }
//
//    private String getAuthorByAuthorId(int author_id) {
//        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE authors.id="+author_id,(ResultSet rs,int rowNum)->{
//            Author author = new Author();
//            author.setId(rs.getInt("id"));
//            author.setAuthor(rs.getString("author"));
//            return author;
//        });
//        return authors.get(0).toString();
//    }

}
