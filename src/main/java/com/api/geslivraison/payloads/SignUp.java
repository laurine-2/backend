package com.api.geslivraison.payloads;

import com.api.geslivraison.model.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

public class SignUp {
    private String nomEntreprise;
    private String statut;
    private String registreCommerce;
    private String carteContribuable;
    private String password;
    private String nonRedevance;

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
}
