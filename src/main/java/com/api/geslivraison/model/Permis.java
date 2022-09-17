package com.api.geslivraison.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Permis")
public class Permis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPermis;
    @Column(name = "typePermis")
    private Date typePermis;
    @Column(name = "description")
    private String description;
    @Column(name = "dateDilivrance")
    private  String dateDilivrance;
    @Column(name = "datePerantion")
    private  String datePerantion;
    @ManyToOne
    private Livreur livreur;

    public Permis() {
    }

    public Long getIdPermis() {
        return idPermis;
    }

    public void setIdPermis(Long idPermis) {
        this.idPermis = idPermis;
    }

    public Date getTypePermis() {
        return typePermis;
    }

    public void setTypePermis(Date typePermis) {
        this.typePermis = typePermis;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateDilivrance() {
        return dateDilivrance;
    }

    public void setDateDilivrance(String dateDilivrance) {
        this.dateDilivrance = dateDilivrance;
    }

    public String getDatePerantion() {
        return datePerantion;
    }

    public void setDatePerantion(String datePerantion) {
        this.datePerantion = datePerantion;
    }

    public Livreur getLivreur() {
        return livreur;
    }

    public void setLivreur(Livreur livreur) {
        this.livreur = livreur;
    }


    public Permis(Long idPermis, Date typePermis, String description, String dateDilivrance, String datePerantion, Livreur livreur) {
        this.idPermis = idPermis;
        this.typePermis = typePermis;
        this.description = description;
        this.dateDilivrance = dateDilivrance;
        this.datePerantion = datePerantion;
        this.livreur = livreur;
    }

    @Override
    public String toString() {
        return "Permis{" +
                "idPermis=" + idPermis +
                ", typePermis=" + typePermis +
                ", description='" + description + '\'' +
                ", dateDilivrance='" + dateDilivrance + '\'' +
                ", datePerantion='" + datePerantion + '\'' +
                ", livreur=" + livreur +
                '}';
    }
}
