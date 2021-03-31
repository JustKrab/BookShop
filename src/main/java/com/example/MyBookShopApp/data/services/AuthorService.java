package com.example.MyBookShopApp.data.services;

import com.example.MyBookShopApp.data.entityes.Author;
import com.example.MyBookShopApp.data.entityes.Book;
import com.example.MyBookShopApp.data.repos.AuthorRepository;
import com.example.MyBookShopApp.data.repos.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class AuthorService {

    private final AuthorRepository authorRepo;
    private final BookRepository bookRepo;
    private final List<DTO> allBooksAndAuthors;

    @Autowired
    public AuthorService(
            BookRepository bookRepo, AuthorRepository authorRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
        allBooksAndAuthors = getAllBooksAndAuthors();
    }

    public List<DTO> getAllBooksAndAuthors() {
        List<Book> books = bookRepo.findAll();
        return createDto(books);
    }

    public List<DTO> getRecentBooksAndAuthors() {
        LocalDateTime dateTo = LocalDateTime.now().minusMonths(1);
        List<Book> books = bookRepo.findAll()
                .stream()
                .filter(b -> b.getPubDate().isAfter(ChronoLocalDate.from(dateTo)))
                .collect(Collectors.toList());
        return createDto(books);
    }

    public DTO getBookBySlug(String slug) {
        return allBooksAndAuthors.stream()
                .filter(dto -> dto.getBook().getSlug().equals(slug))
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }

    public Map<String, List<Author>> getAllAuthorsGrouped() {
        List<Author> authors = authorRepo.findAll();
        return authors.stream().collect(Collectors.groupingBy(a -> a.getAuthor().substring(0, 1)));
    }

    public Author getAuthorById(Integer id) {
        return authorRepo.findAuthorById(id);
    }

    public List<DTO> getBooksByAuthor(Author author) {
        List<Book> books = bookRepo.findBooksByAuthor_Author(author);
        return createDto(books);
    }

    public List<DTO> getRecommendedBooksAndAuthors() {
        List<Book> books = bookRepo.findAll()
                .stream()
                .filter(b -> b.getDiscount() != 0 || b.isBestseller())
                .collect(Collectors.toList());
        return createDto(books);
    }

    private List<DTO> createDto(List<Book> books) {
        List<DTO> booksAndAuthors = new ArrayList<>();

        books.forEach(b -> booksAndAuthors.add(
                createDto(b, authorRepo.findAuthorByBook(b).get(0))));
        return booksAndAuthors;
    }

    private DTO createDto(Book book, Author author) {
        return new DTO(book, author);
    }

    public List<DTO> getPopularBooksAndAuthors() {
        List<Book> books = bookRepo.findAll().stream()
                .filter(Book::isBestseller)
                .collect(Collectors.toList());
        return createDto(books);
    }
}
