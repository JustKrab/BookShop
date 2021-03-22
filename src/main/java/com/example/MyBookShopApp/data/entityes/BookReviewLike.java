package com.example.MyBookShopApp.data.entityes;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "book_review_like ")
public class BookReviewLike {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "INT NOT NULL")
    private Integer id;

    @Column(columnDefinition = "DATETIME NOT NULL")
    private LocalDate time;

    @Column(columnDefinition = "TINYINT NOT NULL")
    private Integer value;

    @OneToOne(targetEntity = BookReview.class, fetch = FetchType.LAZY)
    private BookReview review;

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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public BookReview getReview() {
        return review;
    }

    public void setReview(BookReview review) {
        this.review = review;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
