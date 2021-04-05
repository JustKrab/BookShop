//package com.example.MyBookShopApp.data.entityes;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "book2user_type")
//public class BookToUserType implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(columnDefinition = "INT NOT NULL")
//    private Integer id;
//
//    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
//    private Integer code;
//
//    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
//    private String name;
//
//    enum Type {
//        KEPT(1), CART(2), PAID(3), ARCHIVED(4);
//
//        Type(Integer code) {
//        }
//    }
//
//
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getCode() {
//        return code;
//    }
//
//    public void setCode(Integer code) {
//        this.code = code;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
