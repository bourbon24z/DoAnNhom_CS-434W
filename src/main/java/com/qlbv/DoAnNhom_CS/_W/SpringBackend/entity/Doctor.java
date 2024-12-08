package com.qlbv.DoAnNhom_CS._W.SpringBackend.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.List;

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
    @ManyToOne(cascade =
    { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })
    @JoinColumn(name = "disease_id")
    private Disease disease;
    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "doctor",
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    private List<Patient> patients;

    public Doctor(List<Patient> patients) {
        this.patients = patients;
    }

    public Doctor() {

    }

    public Doctor(String name, String cccd, String dateOfBirth, String email) {
        this.name = name;
        this.cccd = cccd;
        this.dateOfBirth = dateOfBirth;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public void addPatient(Patient patient)
    {
        if(patients==null)
        {
            patients = new ArrayList<>();
        }
        patients.add(patient);
        patient.setDoctor(this);
    }
    @Override
    public String toString()
    {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", CCCD='" + cccd+ '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
