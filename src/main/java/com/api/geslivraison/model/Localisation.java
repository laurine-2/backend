package com.api.geslivraison.model;

import javax.persistence.*;

@Entity
@Table(name = "Localisation")
public class Localisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLocalisation;
    @Column(name = "region")
    private String region;
    @Column(name = "ville")
    private String ville;
    @Column(name = "quartier")
    private String quartier;
    @Column(name = "rue")
    private String rue;
    @Column(name = "longitude")
    private String longitude;
    @Column(name = "latitude")
    private String latitude;
    @ManyToOne
    private Entreprise entreprise;

    public Localisation() {
    }

    public Long getIdLocalisation() {
        return idLocalisation;
    }

    public void setIdLocalisation(Long idLocalisation) {
        this.idLocalisation = idLocalisation;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public Localisation(Long idLocalisation, String region, String ville, String quartier, String rue, String longitude, String latitude, Entreprise entreprise) {
        this.idLocalisation = idLocalisation;
        this.region = region;
        this.ville = ville;
        this.quartier = quartier;
        this.rue = rue;
        this.longitude = longitude;
        this.latitude = latitude;
        this.entreprise = entreprise;
    }

    @Override
    public String toString() {
        return "Localisation{" +
                "idLocalisation=" + idLocalisation +
                ", region='" + region + '\'' +
                ", ville='" + ville + '\'' +
                ", quartier='" + quartier + '\'' +
                ", rue='" + rue + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", entreprise=" + entreprise +
                '}';
    }
}
