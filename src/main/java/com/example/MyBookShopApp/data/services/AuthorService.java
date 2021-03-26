package com.example.MyBookShopApp.data.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.List;


@Service
public class AuthorService {


//    private AuthorRepository authorRepository;

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public AuthorService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<String> getAuthorsData() {
        List<String> authors = jdbcTemplate.query("SELECT author FROM author", (rs, rowNum) -> rs.getString("author"));
        return new ArrayList<>(authors);
    }

    public List<String> getAuthorsAlphabetData() {
        List<String> authors = jdbcTemplate.query("SELECT DISTINCT SUBSTRING(author, 1, 1) as letter FROM author", (rs, rowNum) -> rs.getString("letter"));
        return new ArrayList<>(authors);
    }

//   private JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public AuthorService(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public Map<String, List<Author>> getAuthorsMap() {
//        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors",(ResultSet rs, int rowNum) -> {
//            Author author = new Author();
//            author.setId(rs.getInt("id"));
//            author.setFirstName(rs.getString("first_name"));
//            author.setLastName(rs.getString("last_name"));
//            return author;
//        });
//
//        return authors.stream().collect(Collectors.groupingBy((Author a) -> {return a.getLastName().substring(0,1);}));
//    }
}
