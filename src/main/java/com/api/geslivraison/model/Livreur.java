package com.api.geslivraison.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table (name = "Livreur")
@DiscriminatorColumn(name = "Livreur")
public class Livreur  {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idLivreur;
    @Column(name = "livreurName")
    public String userName;
    @Column(name = "libreurPrenom")
    public String prenom;
    @Column(name = "libreurEmail")
    public String email;
    @Column(name = "libreurTelephone")
    public String telephone;
    @Column(name = "libreurPassword")
    public String password;
    @OneToMany(mappedBy = "livreur")
    private Collection<Livraison> livraison;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Notification> notification = new ArrayList<>();
    @OneToMany(mappedBy = "livreur")
    private Collection<Permis> permis;


    public Livreur() {
    }

    public Long getIdLivreur() {
        return idLivreur;
    }

    public void setIdLivreur(Long idLivreur) {
        this.idLivreur = idLivreur;
    }

    public Collection<Livraison> getLivraison() {
        return livraison;
    }

    public void setLivraison(Collection<Livraison> livraison) {
        this.livraison = livraison;
    }

    public Collection<Notification> getNotification() {
        return notification;
    }

    public void setNotification(Collection<Notification> notification) {
        this.notification = notification;
    }

    public Collection<Permis> getPermis() {
        return permis;
    }

    public void setPermis(Collection<Permis> permis) {
        this.permis = permis;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Livreur(Long idLivreur, String userName, String prenom, String email, String telephone, String password, Collection<Livraison> livraison, Collection<Notification> notification, Collection<Permis> permis) {
        this.idLivreur = idLivreur;
        this.userName = userName;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.livraison = livraison;
        this.notification = notification;
        this.permis = permis;
    }

    @Override
    public String toString() {
        return "Livreur{" +
                "idLivreur=" + idLivreur +
                ", userName='" + userName + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                ", livraison=" + livraison +
                ", notification=" + notification +
                ", permis=" + permis +
                '}';
    }
}
