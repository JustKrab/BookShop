package com.example.MyBookShopApp.data.entityes;

import java.io.Serializable;
import java.util.Objects;

public class BookToAuthorKP implements Serializable {

        private Integer book;
        private Integer author;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookToAuthorKP that = (BookToAuthorKP) o;
        return Objects.equals(book, that.book) &&
                Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, author);
    }

    public Integer getBook() {
        return book;
    }

    public void setBook(Integer book) {
        this.book = book;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }


}
