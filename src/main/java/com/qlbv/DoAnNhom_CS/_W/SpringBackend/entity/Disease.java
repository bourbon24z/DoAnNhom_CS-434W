package com.qlbv.DoAnNhom_CS._W.SpringBackend.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Disease {
    private int id;
    private String diseaseName;
    private String description;
    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "disease",
            cascade = {CascadeType.DETACH, CascadeType.MERGE,
                        CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name = "patient_disease")
    public List<Doctor> doctors;
}
