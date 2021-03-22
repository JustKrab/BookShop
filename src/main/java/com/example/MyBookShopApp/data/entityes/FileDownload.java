package com.example.MyBookShopApp.data.entityes;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book_file_type")
public class FileDownload implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "INT NOT NULL")
    private Integer id;

    @Id
    @ManyToOne(targetEntity = Book.class, fetch = FetchType.LAZY)
    private Book book;

    @Id
    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    private User user;

    @Column(columnDefinition = "INT NOT NULL DEFAULT 1")
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
