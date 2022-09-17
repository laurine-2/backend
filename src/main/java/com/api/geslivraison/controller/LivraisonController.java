package com.api.geslivraison.controller;


import com.api.geslivraison.model.Livraison;
import com.api.geslivraison.service.LivraisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class LivraisonController {

    //autowire la classe LivraisonService
    @Autowired
    LivraisonService livraisonService;
    // création d'un mappage get qui récupère tous les détails des Livraison de la base de données
    @GetMapping("/Livraison")
    private List<Livraison> getAllLivraison()
    {
        return livraisonService.getAllLivraison();
    }
    // création d'un mappage get qui récupère le détail d'un Livraison spécifique
    @GetMapping("/livraison/{livraisonid}")
    private Livraison getLivraison(@PathVariable("livraisonid") Long livraisonid)
    {
        return livraisonService.getLivraisonById(livraisonid);
    }
    // création d'un mappage de suppression qui supprime un Livraison spécifié
    @DeleteMapping("/livraison/{userid}")
    private void deleteLivraison(@PathVariable("livraisonid") Long livraisonid)
    {
        livraisonService.delete(livraisonid);
    }
    // création d'un mappage de publication qui publie les détails de l'Livraison dans la base de données
    @PostMapping("/livraison")
    private Long saveLivraison(@RequestBody Livraison livraison)
    {
        livraisonService.saveOrUpdate(livraison);
        return livraison.getIdLivraison();
    }
    // création d'un put mapping qui met à jour les détails de Livraison
    @PutMapping("/livraison")
    private Livraison update(@RequestBody Livraison livraison)
    {
        livraisonService.saveOrUpdate(livraison);
        return livraison;
    }
}
