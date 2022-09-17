package com.api.geslivraison.model;

import javax.persistence.*;

@Entity
@Table(name = "TypeNotification")
public class TypeNotification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTypeNotification;
    @Column(name = "titre")
    private String titre;
    @Column(name = "description")
    private String description;
    @Column(name = "recepteur")
    private String recepteur;

    public TypeNotification() {
    }

    public Long getIdTypeNotification() {
        return idTypeNotification;
    }

    public void setIdTypeNotification(Long idTypeNotification) {
        this.idTypeNotification = idTypeNotification;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRecepteur() {
        return recepteur;
    }

    public void setRecepteur(String recepteur) {
        this.recepteur = recepteur;
    }

    public TypeNotification(Long idTypeNotification, String titre, String description, String recepteur) {
        this.idTypeNotification = idTypeNotification;
        this.titre = titre;
        this.description = description;
        this.recepteur = recepteur;
    }

    @Override
    public String toString() {
        return "TypeNotification{" +
                "idTypeNotification=" + idTypeNotification +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", recepteur='" + recepteur + '\'' +
                '}';
    }
}
