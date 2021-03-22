package com.example.MyBookShopApp.data.entityes;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "balance_transaction")
public class BalanceTransaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "INT NOT NULL")
    private Integer id;

    @Id
    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    private User user;

    @Column(columnDefinition = "DATE NOT NULL")
    private LocalDate time;

    @Column(columnDefinition = "INT NOT NULL  DEFAULT 0 ")
    private Integer value;

    @Id
    @ManyToOne(targetEntity = Book.class, fetch = FetchType.LAZY)
    private Book book;

    @Column(columnDefinition = "TEXT NOT NULL ")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
