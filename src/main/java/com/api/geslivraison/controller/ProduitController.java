package com.api.geslivraison.controller;

import com.api.geslivraison.model.Produit;
import com.api.geslivraison.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class ProduitController {
    //autowire la classe UserService
    @Autowired
    ProduitService produitService;
    // création d'un mappage get qui récupère tous les détails des utilisateur de la base de données
    @GetMapping("/produit")
    private List<Produit> getAllProduit()
    {
        return produitService.getAllProduit();
    }
    // création d'un mappage get qui récupère le détail d'un utilisateur spécifique
    @GetMapping("/produit/{produitid}")
    private Produit getProduit(@PathVariable("produitid") Long produitid)
    {
        return produitService.getProduitById(produitid);
    }
    // création d'un mappage de suppression qui supprime un utilisateur spécifié
    @DeleteMapping("/produit/{produitid}")
    private void deleteUser(@PathVariable("produitid") Long produitid)
    {
        produitService.delete(produitid);
    }
    // création d'un mappage de publication qui publie les détails de l'utilisateur dans la base de données
    @PostMapping("/produit")
    private Long savePoduit(@RequestBody Produit produit)
    {
        produitService.saveOrUpdate(produit);
        return produit.getIdPoduit();
    }
    // création d'un put mapping qui met à jour les détails de l'utilisateur
    @PutMapping("/produit")
    private Produit update(@RequestBody Produit produit)
    {
        produitService.saveOrUpdate(produit);
        return produit;
    }
}
