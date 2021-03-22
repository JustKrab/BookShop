package com.example.MyBookShopApp.data.entityes;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "INT NOT NULL")
    private Integer id;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String hash;

    @Column(columnDefinition = "DATE NOT NULL")
    private LocalDate regTime;

    @Column(columnDefinition = "INT NOT NULL")
    private Integer balance;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String name;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<BookReview> bookReviews;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<BookReviewLike> bookLikes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public LocalDate getRegTime() {
        return regTime;
    }

    public void setRegTime(LocalDate regTime) {
        this.regTime = regTime;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookReview> getBookReviews() {
        return bookReviews;
    }

    public void setBookReviews(List<BookReview> bookReviews) {
        this.bookReviews = bookReviews;
    }

    public List<BookReviewLike> getBookLikes() {
        return bookLikes;
    }

    public void setBookLikes(List<BookReviewLike> bookLikes) {
        this.bookLikes = bookLikes;
    }
}
