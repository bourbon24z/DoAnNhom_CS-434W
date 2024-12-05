package com.qlbv.DoAnNhom_CS._W.SpringBackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column (name = "patientName")
    private String patientName;
    @Column (name = "gender")
    private String gender;
    @Column (name = "cccd")
    private String cccd;
    @Column (name = "dateOfBirth")
    @DateTimeFormat (pattern = "dd-MM-yyyy")
    private Date dateOfBirth;
    @Column (name = "diseaseHistory")
    private String diseaseHistory;
    @Column (name = "prescription")
    private String prescription;
    @Column (name = "treatmentCost")
    private double treatmentCost;
    @Column (name = "medicationCost")
    private double medicationCost;
    @Column (name = "totalCost")
    private double totalCost;

    private Doctor doctor;

    private List<Disease> diseaseList;

    public Patient(String patientName, String gender, String cccd, Date dateOfBirth,
                   String diseaseHistory, String prescription) {
        this.patientName = patientName;
        this.gender = gender;
        this.cccd = cccd;
        this.dateOfBirth = dateOfBirth;
        this.diseaseHistory = diseaseHistory;
        this.prescription = prescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDiseaseHistory() {
        return diseaseHistory;
    }

    public void setDiseaseHistory(String diseaseHistory) {
        this.diseaseHistory = diseaseHistory;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public double getTreatmentCost() {
        return treatmentCost;
    }

    public void setTreatmentCost(double treatmentCost) {
        this.treatmentCost = treatmentCost;
    }

    public double getMedicationCost() {
        return medicationCost;
    }

    public void setMedicationCost(double medicationCost) {
        this.medicationCost = medicationCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public List<Disease> getDiseaseList() {
        return diseaseList;
    }

    public void setDiseaseList(List<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }
}
