package com.qlbv.DoAnNhom_CS._W.SpringBackend.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Disease {
    @Column(name = "id")
    private int id;
    @Column(name = "diseaseName")
    private String diseaseName;
    @Column(name = "description")
    private String description;
    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "disease",
            cascade = {CascadeType.DETACH, CascadeType.MERGE,
                        CascadeType.PERSIST, CascadeType.REFRESH})
    public List<Doctor> doctors;

    @ManyToMany(fetch = FetchType.LAZY,
        cascade = {CascadeType.DETACH, CascadeType.MERGE,
                CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name = "patient_disease",
            joinColumns = @JoinColumn(name = "disease_id"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))
    public List<Patient> patientList;

    public Disease() {
    }
    public Disease(String name, String description)
    {
        this.diseaseName = name;
        this.description = description;
    }

    public List<Doctor> getDoctors()
    {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors)
    {
        this.doctors = doctors;
    }

    public void addDoctor(Doctor doctor)
    {
        if(doctors == null)
        {
            doctors = new ArrayList<>();
        }
        doctors.add(doctor);
    }
    public void addPatient(Patient patient)
    {
        if(patientList == null)
        {
            patientList = new ArrayList<>();
        }
        patientList.add(patient);
    }
    public Disease(int id, String name, String description)
    {
        this.id = id;
        this.diseaseName = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disease other = (Disease) obj;
        if (this.description != other.description) {
            return false;
        }
        if (!Objects.equals(this.diseaseName, other.diseaseName)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    @Override
    public String toString()
    {
        return "id = " + id +
                ", diseaseName = '" + diseaseName + '\'' +
                ", description = '" + description;
    }
}

