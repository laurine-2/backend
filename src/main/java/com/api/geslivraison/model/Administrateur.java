package com.api.geslivraison.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "Administrateur")
public class Administrateur  {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idAdmiistrateur;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "telephone")
    private int telephone;
    @Column(name = "password")
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Notification>notification=new ArrayList<>();

    public Administrateur() {
    }

    public Long getIdAdmiistrateur() {
        return idAdmiistrateur;
    }

    public void setIdAdmiistrateur(Long idAdmiistrateur) {
        this.idAdmiistrateur = idAdmiistrateur;
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

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Notification> getNotification() {
        return notification;
    }

    public void setNotification(Collection<Notification> notification) {
        this.notification = notification;
    }

    public Administrateur(Long idAdmiistrateur, String nom, String prenom, int telephone, String password, Collection<Notification> notification) {
        this.idAdmiistrateur = idAdmiistrateur;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.password = password;
        this.notification = notification;
    }

    @Override
    public String toString() {
        return "Administrateur{" +
                "idAdmiistrateur=" + idAdmiistrateur +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone=" + telephone +
                ", password='" + password + '\'' +
                ", notification=" + notification +
                '}';
    }
}

