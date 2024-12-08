package com.qlbv.DoAnNhom_CS._W.SpringBackend.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contact")

public class Contact {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column (name = "name")
    private String name;
    @Column(name = "message")
    private String message;
    @Column(name = "email")
    private String email;

    public Contact() {
    }

    public Contact(String message, String email) {
        this.message = message;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString()
    {
        return "Contact{" +
                "Id=" + id +
                ", message='" + message + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
