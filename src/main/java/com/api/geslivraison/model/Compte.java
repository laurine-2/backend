package com.api.geslivraison.model;

import javax.persistence.*;

@Entity
@Table(name = "Compte")
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompte;
    @Column(name = "stutut")
    private String statut;
    @Column(name = "dateValidation")
    private String dateValidation;
    @ManyToOne
    private Entreprise entreprise;

    public Compte() {
    }

    public Long getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(Long idCompte) {
        this.idCompte = idCompte;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(String dateValidation) {
        this.dateValidation = dateValidation;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public Compte(Long idCompte, String statut, String dateValidation, Entreprise entreprise) {
        this.idCompte = idCompte;
        this.statut = statut;
        this.dateValidation = dateValidation;
        this.entreprise = entreprise;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "idCompte=" + idCompte +
                ", statut='" + statut + '\'' +
                ", dateValidation='" + dateValidation + '\'' +
                ", entreprise=" + entreprise +
                '}';
    }
}
