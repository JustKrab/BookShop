package com.example.MyBookShopApp.data.entityes;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "book_review")
public class BookReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "INT NOT NULL")
    private Integer id;

    @Column(columnDefinition = "DATE NOT NULL")
    private LocalDate time;

    @Column(columnDefinition = "TEXT NOT NULL")
    private String text;

    @ManyToOne(targetEntity = Book.class, fetch = FetchType.LAZY)
    private Book book;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    private User user;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
