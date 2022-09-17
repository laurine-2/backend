package com.api.geslivraison.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table (name = "Facture")
public class Facture {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idFacture;
    @Column(name = "nombreLivraison")
    private String nombreLivraison;
    @Column(name = "dateDebutFacture")
    private String dateDebutFacture;
    @Column(name = "dateFinFacture")
    private String dateFinFacture;
    @Column(name = "dateDelivranceFacture")
    private String dateDelivranceFacture;
    @OneToMany(mappedBy = "facture")
    private Collection<Livraison> livraison;
    @OneToMany(mappedBy = "facture")
    private Collection<Payement>payement;

    public Facture() {
    }

    public Long getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(Long idFacture) {
        this.idFacture = idFacture;
    }

    public String getNombreLivraison() {
        return nombreLivraison;
    }

    public void setNombreLivraison(String nombreLivraison) {
        this.nombreLivraison = nombreLivraison;
    }

    public String getDateDebutFacture() {
        return dateDebutFacture;
    }

    public void setDateDebutFacture(String dateDebutFacture) {
        this.dateDebutFacture = dateDebutFacture;
    }

    public String getDateFinFacture() {
        return dateFinFacture;
    }

    public void setDateFinFacture(String dateFinFacture) {
        this.dateFinFacture = dateFinFacture;
    }

    public String getDateDelivranceFacture() {
        return dateDelivranceFacture;
    }

    public void setDateDelivranceFacture(String dateDelivranceFacture) {
        this.dateDelivranceFacture = dateDelivranceFacture;
    }

    public Collection<Livraison> getLivraison() {
        return livraison;
    }

    public void setLivraison(Collection<Livraison> livraison) {
        this.livraison = livraison;
    }

    public Collection<Payement> getPayement() {
        return payement;
    }

    public void setPayement(Collection<Payement> payement) {
        this.payement = payement;
    }

    public Facture(Long idFacture, String nombreLivraison, String dateDebutFacture, String dateFinFacture, String dateDelivranceFacture, Collection<Livraison> livraison, Collection<Payement> payement) {
        this.idFacture = idFacture;
        this.nombreLivraison = nombreLivraison;
        this.dateDebutFacture = dateDebutFacture;
        this.dateFinFacture = dateFinFacture;
        this.dateDelivranceFacture = dateDelivranceFacture;
        this.livraison = livraison;
        this.payement = payement;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "idFacture=" + idFacture +
                ", nombreLivraison='" + nombreLivraison + '\'' +
                ", dateDebutFacture='" + dateDebutFacture + '\'' +
                ", dateFinFacture='" + dateFinFacture + '\'' +
                ", dateDelivranceFacture='" + dateDelivranceFacture + '\'' +
                ", livraison=" + livraison +
                ", payement=" + payement +
                '}';
    }
}
