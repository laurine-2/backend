package com.api.geslivraison.model;

import javax.persistence.*;

@Entity
@Table(name = "Payement")
public class Payement {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idPayement;
    @Column (name = "montant")
    private String montant;
    @Column(name = "typePayement")
    private String typePayement;
    @ManyToOne
    private Entreprise entreprise;
    @ManyToOne
    private Facture facture;

    public Payement() {
    }

    public Long getIdPayement() {
        return idPayement;
    }

    public void setIdPayement(Long idPayement) {
        this.idPayement = idPayement;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getTypePayement() {
        return typePayement;
    }

    public void setTypePayement(String typePayement) {
        this.typePayement = typePayement;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public Payement(Long idPayement, String montant, String typePayement, Entreprise entreprise, Facture facture) {
        this.idPayement = idPayement;
        this.montant = montant;
        this.typePayement = typePayement;
        this.entreprise = entreprise;
        this.facture = facture;
    }

    @Override
    public String toString() {
        return "Payement{" +
                "idPayement=" + idPayement +
                ", montant='" + montant + '\'' +
                ", typePayement='" + typePayement + '\'' +
                ", entreprise=" + entreprise +
                ", facture=" + facture +
                '}';
    }
}
