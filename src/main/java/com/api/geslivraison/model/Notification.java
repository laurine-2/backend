package com.api.geslivraison.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "Notification")
public class Notification {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idNotification;

    //@ManyToMany (mappedBy = "notification",fetch = FetchType.EAGER)
    //private Collection<Entreprise> entreprise=new ArrayList<>();
    @ManyToMany (mappedBy = "notification",fetch = FetchType.EAGER)
    private Collection<Livreur> livreur=new ArrayList<>();
    //@ManyToMany (mappedBy = "notification",fetch = FetchType.EAGER)
    //private Collection<Administrateur> administrateur=new ArrayList<>();

    public Notification() {
    }

    // public Collection<Entreprise> getEntreprise() {
    //   return entreprise;
    //}

    //public void setEntreprise(Collection<Entreprise> entreprise) {
    //   this.entreprise = entreprise;
    //}

    //public Collection<Administrateur> getAdministrateur() {
    //    return administrateur;
    //}

    //public void setAdministrateur(Collection<Administrateur> administrateur) {
     //   this.administrateur = administrateur;
    //}


    public Long getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(Long idNotification) {
        this.idNotification = idNotification;
    }

    public Collection<Livreur> getLivreur() {
        return livreur;
    }

    public void setLivreur(Collection<Livreur> livreur) {
        this.livreur = livreur;
    }

    public Notification(Long idNotification, Collection<Livreur> livreur) {
        this.idNotification = idNotification;
        this.livreur = livreur;
    }


    @Override
    public String toString() {
        return "Notification{" +
                "idNotification=" + idNotification +
                ", livreur=" + livreur +
                '}';
    }
}


