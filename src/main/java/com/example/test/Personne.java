package com.example.test;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = "Personne")
@Table(name = "personne")
public class Personne {

    @Id
    @SequenceGenerator(name = "personne_sequence", sequenceName = "personne_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personne_sequence")
    @Column(name = "id")
    private Long id;

    @Column(name = "nom", nullable = false, columnDefinition = "TEXT")
    private String nom;

    @Column(name = "prenom", nullable = false, columnDefinition = "TEXT")
    private String prenom;

    @Column(name = "dob")
    private LocalDate dob;

    @Transient
    private Integer age;

    public Personne(String nom, String prenom, LocalDate dob) {
        this.nom = nom;
        this.prenom = prenom;
        this.dob = dob;
    }

    public Personne() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
