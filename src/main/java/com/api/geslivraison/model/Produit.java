package com.api.geslivraison.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "Produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPoduit;
    @Column(name = "nomProduit")
    private String nomProduit;
    @Column(name = "poid")
    private String poid;
    @Column(name = "taille")
    private String taille;
    @Column(name = "stype")
    private String stype;
    @Column(name = "photo")
    private String photo;
    @ManyToOne
    private FormulaireLivraison formulaireLivraison;

  //  @ManyToMany(mappedBy ="produit", fetch = FetchType.EAGER)
  //private Collection<Livraison> livraison= new ArrayList<>();

    public Produit() {
    }

    public Long getIdPoduit() {
        return idPoduit;
    }

    public void setIdPoduit(Long idPoduit) {
        this.idPoduit = idPoduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getPoid() {
        return poid;
    }

    public void setPoid(String poid) {
        this.poid = poid;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }



    public Produit(Long idPoduit, String nomProduit, String poid, String taille, String stype, String photo, FormulaireLivraison formulaireLivraison) {
        this.idPoduit = idPoduit;
        this.nomProduit = nomProduit;
        this.poid = poid;
        this.taille = taille;
        this.stype = stype;
        this.photo = photo;
        this.formulaireLivraison = formulaireLivraison;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "idPoduit=" + idPoduit +
                ", nomProduit='" + nomProduit + '\'' +
                ", poid='" + poid + '\'' +
                ", taille='" + taille + '\'' +
                ", stype='" + stype + '\'' +
                ", photo='" + photo + '\'' +
                ", formulaireLivraison=" + formulaireLivraison +
                '}';
    }
}
