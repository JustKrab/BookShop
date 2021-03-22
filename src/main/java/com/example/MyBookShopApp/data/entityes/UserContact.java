package com.example.MyBookShopApp.data.entityes;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_contact")
public class UserContact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "INT NOT NULL")
    private Integer id;

    @OneToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    private User user;

    @Column(columnDefinition = "SMALLINT NOT NULL")
    private Type type;

    @Column(columnDefinition = "BOOLEAN NOT NULL")
    private boolean approved;

    @Column(columnDefinition = "VARCHAR(255)")
    private String code;

    @Column(columnDefinition = "INT")
    private Integer codeTrials;

    @Column(columnDefinition = "DATE")
    private LocalDateTime codeTime;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String contact;

    enum Type {
        PHONE, EMAIL
    }

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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCodeTrials() {
        return codeTrials;
    }

    public void setCodeTrials(Integer codeTrials) {
        this.codeTrials = codeTrials;
    }

    public LocalDateTime getCodeTime() {
        return codeTime;
    }

    public void setCodeTime(LocalDateTime codeTime) {
        this.codeTime = codeTime;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
