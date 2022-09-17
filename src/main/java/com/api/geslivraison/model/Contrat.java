package com.api.geslivraison.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Contrat")
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    @Column(name = "statut")
    private String statut;
    @Column(name = "description")
    private String description;
    @Column(name = "dateSignature")
    private Date dateSignature;
    @Column(name = "type")
    private String type;
    @ManyToOne
    private Entreprise entreprise;


    public Contrat() {
    }

    public Long getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(Long idContrat) {
        this.idContrat = idContrat;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateSignature() {
        return dateSignature;
    }

    public void setDateSignature(Date dateSignature) {
        this.dateSignature = dateSignature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public Contrat(Long idContrat, String statut, String description, Date dateSignature, String type, Entreprise entreprise) {
        this.idContrat = idContrat;
        this.statut = statut;
        this.description = description;
        this.dateSignature = dateSignature;
        this.type = type;
        this.entreprise = entreprise;
    }

    @Override
    public String toString() {
        return "Contrat{" +
                "idContrat=" + idContrat +
                ", statut='" + statut + '\'' +
                ", description='" + description + '\'' +
                ", dateSignature=" + dateSignature +
                ", type='" + type + '\'' +
                ", entreprise=" + entreprise +
                '}';
    }
}
