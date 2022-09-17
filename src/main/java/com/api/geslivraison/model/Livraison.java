package com.api.geslivraison.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "Livraison")
public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLivraison;
    @Column(name = "dateLivraison")
    private Date dateLivraison;
    @Column(name = "etatLivraison")
    private String etatLivraison;
    @Column(name = "prixLivraison")
    private  String prixLivraison;
    @ManyToOne
    private FormulaireLivraison formulaireLivraison;

   // @Embedded
    //private Produit produit;

    @ManyToOne
    private Livreur livreur;
    @ManyToOne
    private Facture facture;

    public Livraison() {
    }

    public Long getIdLivraison() {
        return idLivraison;
    }

    public void setIdLivraison(Long idLivraison) {
        this.idLivraison = idLivraison;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public String getEtatLivraison() {
        return etatLivraison;
    }

    public void setEtatLivraison(String etatLivraison) {
        this.etatLivraison = etatLivraison;
    }

    public String getPrixLivraison() {
        return prixLivraison;
    }

    public void setPrixLivraison(String prixLivraison) {
        this.prixLivraison = prixLivraison;
    }

    public FormulaireLivraison getFormulaireLivraison() {
        return formulaireLivraison;
    }

    public void setFormulaireLivraison(FormulaireLivraison formulaireLivraison) {
        this.formulaireLivraison = formulaireLivraison;
    }

    public Livreur getLivreur() {
        return livreur;
    }

    public void setLivreur(Livreur livreur) {
        this.livreur = livreur;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public Livraison(Long idLivraison, Date dateLivraison, String etatLivraison, String prixLivraison, FormulaireLivraison formulaireLivraison, Livreur livreur, Facture facture) {
        this.idLivraison = idLivraison;
        this.dateLivraison = dateLivraison;
        this.etatLivraison = etatLivraison;
        this.prixLivraison = prixLivraison;
        this.formulaireLivraison = formulaireLivraison;
        this.livreur = livreur;
        this.facture = facture;
    }

    @Override
    public String toString() {
        return "Livraison{" +
                "idLivraison=" + idLivraison +
                ", dateLivraison=" + dateLivraison +
                ", etatLivraison='" + etatLivraison + '\'' +
                ", prixLivraison='" + prixLivraison + '\'' +
                ", formulaireLivraison=" + formulaireLivraison +
                ", livreur=" + livreur +
                ", facture=" + facture +
                '}';
    }
}
