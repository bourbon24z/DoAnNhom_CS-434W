package com.qlbv.DoAnNhom_CS._W.SpringBackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "cccd")
    private String cccd;
    @Column(name = "email")
    private String email;
    @Column(name = "dateOfBirth")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private String dateOfBirth;

}
