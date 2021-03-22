package com.example.MyBookShopApp.data.entityes;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book2genre")
public class BookToGenre implements Serializable {

    @Id
    @ManyToOne(targetEntity = Book.class, fetch = FetchType.LAZY)
    private Book book;

    @Id
    @ManyToOne(targetEntity = Genres.class, fetch = FetchType.LAZY)
    private Genres genre;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }
}
