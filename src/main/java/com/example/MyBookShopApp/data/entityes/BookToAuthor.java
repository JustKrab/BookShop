package com.example.MyBookShopApp.data.entityes;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "book2author")
@IdClass(BookToAuthorKP.class)
public class BookToAuthor implements Serializable {

    @Id
    @ManyToOne(targetEntity = Book.class, fetch = FetchType.LAZY)
    private Book book;

    @Id
    @ManyToOne(targetEntity = Author.class, fetch = FetchType.LAZY)
    private Author author;

    @Column(columnDefinition = "INT NOT NULL DEFAULT 0")
    private Integer sortIndex;



    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }
}
