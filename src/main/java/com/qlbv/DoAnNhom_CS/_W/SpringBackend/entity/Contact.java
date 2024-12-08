package com.qlbv.DoAnNhom_CS._W.SpringBackend.entity;

public class Contact {
    private int id;
    private String name;
    private String message;
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
