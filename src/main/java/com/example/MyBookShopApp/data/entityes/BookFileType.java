package com.example.MyBookShopApp.data.entityes;

import javax.persistence.*;
import java.util.stream.Stream;


@Entity
@Table(name = "book_file_type")
public class BookFileType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "INT NOT NULL")
    private Integer id;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToOne(mappedBy = "type")
    private BookFile file;

    public enum FileType {
        PDF(1), EPUB(2), FB2(3);
        private final int code;

        FileType(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }

        public static FileType of(String name) {
            return Stream.of(FileType.values())
                    .filter(type -> type.name().equals(name))
                    .findFirst()
                    .orElseThrow(IllegalArgumentException::new);
        }

    }

    public BookFile getFile() {
        return file;
    }

    public void setFile(BookFile file) {
        this.file = file;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
