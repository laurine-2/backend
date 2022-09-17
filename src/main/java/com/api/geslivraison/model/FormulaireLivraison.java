package com.api.geslivraison.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "FormulaireLivraison")
public class FormulaireLivraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormulaireLivraison;
    @Column(name = "nomRecepteur")
    private String nomRecepteur;
    @Column(name = "quartier")
    private String quartier;
    @Column(name = "dateLivraison")
    private Date dateLivraison;
    @Column(name = "rue")
    private String rue;
    @Column(name = "telephoneRecepteur")
    private int tephoneRecepteur;
    @Column(name = "ville")
    private String ville;
    @Column(name = "etat_de_la_demande")
    private String etatDemande;
    @OneToMany(mappedBy = "formulaireLivraison")
    private Collection<Livraison>livraison;
    @OneToMany(mappedBy = "formulaireLivraison")
    private Collection<Produit>produit;
    @ManyToOne
    private Entreprise entreprise;

    public FormulaireLivraison() {
    }



    public Long getIdFormulaireLivraison() {
        return idFormulaireLivraison;
    }

    public void setIdFormulaireLivraison(Long idFormulaireLivraison) {
        this.idFormulaireLivraison = idFormulaireLivraison;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public String getNomRecepteur() {
        return nomRecepteur;
    }

    public void setNomRecepteur(String nomRecepteur) {
        this.nomRecepteur = nomRecepteur;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getTephoneRecepteur() {
        return tephoneRecepteur;
    }

    public void setTephoneRecepteur(int tephoneRecepteur) {
        this.tephoneRecepteur = tephoneRecepteur;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Collection<Livraison> getLivraison() {
        return livraison;
    }

    public void setLivraison(Collection<Livraison> livraison) {
        this.livraison = livraison;
    }

    public Collection<Produit> getProduit() {
        return produit;
    }

    public void setProduit(Collection<Produit> produit) {
        this.produit = produit;
    }

    public String getEtatDemande() {
        return etatDemande;
    }

    public void setEtatDemande(String etatDemande) {
        this.etatDemande = etatDemande;
    }


    public FormulaireLivraison(Long idFormulaireLivraison, String nomRecepteur, String quartier, Date dateLivraison, String rue, int tephoneRecepteur, String ville, String etatDemande, Collection<Livraison> livraison, Collection<Produit> produit, Entreprise entreprise) {
        this.idFormulaireLivraison = idFormulaireLivraison;
        this.nomRecepteur = nomRecepteur;
        this.quartier = quartier;
        this.dateLivraison = dateLivraison;
        this.rue = rue;
        this.tephoneRecepteur = tephoneRecepteur;
        this.ville = ville;
        this.etatDemande = etatDemande;
        this.livraison = livraison;
        this.produit = produit;
        this.entreprise = entreprise;
    }

    @Override
    public String toString() {
        return "FormulaireLivraison{" +
                "idFormulaireLivraison=" + idFormulaireLivraison +
                ", nomRecepteur='" + nomRecepteur + '\'' +
                ", quartier='" + quartier + '\'' +
                ", dateLivraison=" + dateLivraison +
                ", rue='" + rue + '\'' +
                ", tephoneRecepteur=" + tephoneRecepteur +
                ", ville='" + ville + '\'' +
                ", etatDemande='" + etatDemande + '\'' +
                ", livraison=" + livraison +
                ", produit=" + produit +
                ", entreprise=" + entreprise +
                '}';
    }
}
