package com.example.dockerproject.Models;


import lombok.Data;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User  {
@Id
    private String nom ;
    private String prenom ;

    public User(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public User() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
