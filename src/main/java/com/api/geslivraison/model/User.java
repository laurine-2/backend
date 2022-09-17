package com.api.geslivraison.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(	name = "Users")
@Inheritance
/*@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYPE", length = 4)*/
public  class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idCompte;
    @Column(name = "userName")
    public String userName;
    @Column(name = "prenom")
    public String prenom;
    @Column(name = "email")
    public String email;
    @Column(name = "telephone")
    public String telephone;
    @Column(name = "password")
    public String password;


    public User() {
    }

    public User(String userName, String email, String encode) {
    }



    public Long getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(Long idCompte) {
        this.idCompte = idCompte;
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



    public User(Long idCompte, String userName, String prenom, String email, String telephone, String password) {
        this.idCompte = idCompte;
        this.userName = userName;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "idCompte=" + idCompte +
                ", userName='" + userName + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
