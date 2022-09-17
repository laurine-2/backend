package com.api.geslivraison.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "Entreprise")
public class Entreprise {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idEntreprise;
    @Column(name = "nomEntreprise")
    private String nomEntreprise;
    @Column(name = "statut")
    private String statut;
    @Column(name = "registreCommerce")
    private String registreCommerce;
    @Column(name = "carteContribuable")
    private String carteContribuable;
    @Column(name = "password")
    private String password;
    @Column(name = "certif")
    private String certif;
    @Column(name = "nonRedevance")
    private String nonRedevance;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Notification>notification=new ArrayList<>();
    @OneToMany(mappedBy = "entreprise")
    private Collection<Payement>payement;
    @OneToMany(mappedBy = "entreprise")
    private Collection<Localisation>localisation;
    @OneToMany(mappedBy = "entreprise")
    private Collection<Compte>compte;
    @OneToMany(mappedBy = "entreprise")
    private Collection<Contrat>contrat;
    @OneToMany(mappedBy = "entreprise")
    private Collection<FormulaireLivraison> formulaireLivraison;


    public Entreprise() {
    }

    public Long getIdEntreprise() {
        return idEntreprise;
    }

    public void setIdEntreprise(Long idEntreprise) {
        this.idEntreprise = idEntreprise;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getRegistreCommerce() {
        return registreCommerce;
    }

    public void setRegistreCommerce(String registreCommerce) {
        this.registreCommerce = registreCommerce;
    }

    public String getCarteContribuable() {
        return carteContribuable;
    }

    public void setCarteContribuable(String carteContribuable) {
        this.carteContribuable = carteContribuable;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNonRedevance() {
        return nonRedevance;
    }

    public void setNonRedevance(String nonRedevance) {
        this.nonRedevance = nonRedevance;
    }

    public Collection<Notification> getNotification() {
        return notification;
    }

    public void setNotification(Collection<Notification> notification) {
        this.notification = notification;
    }

    public Collection<Payement> getPayement() {
        return payement;
    }

    public void setPayement(Collection<Payement> payement) {
        this.payement = payement;
    }

    public Collection<Localisation> getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Collection<Localisation> localisation) {
        this.localisation = localisation;
    }

    public Collection<Compte> getCompte() {
        return compte;
    }

    public void setCompte(Collection<Compte> compte) {
        this.compte = compte;
    }

    public Collection<Contrat> getContrat() {
        return contrat;
    }

    public void setContrat(Collection<Contrat> contrat) {
        this.contrat = contrat;
    }

    public Collection<FormulaireLivraison> getFormulaireLivraison() {
        return formulaireLivraison;
    }

    public void setFormulaireLivraison(Collection<FormulaireLivraison> formulaireLivraison) {
        this.formulaireLivraison = formulaireLivraison;
    }


    public Entreprise( String nomEntreprise, String statut, String registreCommerce, String carteContribuable, String password,  String nonRedevance , String certif) {

        this.nomEntreprise = nomEntreprise;
        this.statut = statut;
        this.registreCommerce = registreCommerce;
        this.carteContribuable = carteContribuable;
        this.nonRedevance = nonRedevance;
        this.password = password;
        this.certif = certif;
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "idEntreprise=" + idEntreprise +
                ", nomEntreprise='" + nomEntreprise + '\'' +
                ", statut='" + statut + '\'' +
                ", registreCommerce='" + registreCommerce + '\'' +
                ", carteContribuable='" + carteContribuable + '\'' +
                ", password='" + password + '\'' +
                ", nonRedevance='" + nonRedevance + '\'' +
                ", notification=" + notification +
                ", payement=" + payement +
                ", localisation=" + localisation +
                ", compte=" + compte +
                ", contrat=" + contrat +
                ", formulaireLivraison=" + formulaireLivraison +
                '}';
    }
}
