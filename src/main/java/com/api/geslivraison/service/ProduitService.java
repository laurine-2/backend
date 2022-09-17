package com.api.geslivraison.service;


import com.api.geslivraison.model.Produit;
import com.api.geslivraison.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduitService {
    @Autowired
    ProduitRepository produitRepository;
    //obtenir tous les enregistrements de utilisateur en utilisant la méthode findaAll() de CrudRepository
    public List<Produit> getAllProduit()
    {
        List<Produit> produit = new ArrayList<Produit>();
        produitRepository.findAll().forEach(produit1 -> produit.add(produit1));
        return produit;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public Produit getProduitById(Long idProduit)
    {
        return produitRepository.findById(idProduit).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(Produit produit)
    {
        produitRepository.save(produit);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idProduit)
    {
        produitRepository.deleteById(idProduit);
    }
    //mise à jour d'un enregistrement
    public void update(Produit produit, Long produitid)
    {
        produitRepository.save(produit);
    }

}
