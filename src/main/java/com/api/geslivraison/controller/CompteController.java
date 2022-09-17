package com.api.geslivraison.controller;

import com.api.geslivraison.model.Compte;
import com.api.geslivraison.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class CompteController {
    //autowire la classe CompteService
    @Autowired
    CompteService compteService;
    // création d'un mappage get qui récupère tous les détails des Compte de la base de données
    @GetMapping("/compte")
    private List<Compte> getAllCompte()
    {
        return compteService.getAllCompte();
    }
    // création d'un mappage get qui récupère le détail d'un Compte spécifique
    @GetMapping("/compte/{compteid}")
    private Compte getCompte(@PathVariable("compteid") Long compteid)
    {
        return compteService.getCompteById(compteid);
    }
    // création d'un mappage de suppression qui supprime un Compte spécifié
    @DeleteMapping("/compte/{compteid}")
    private void deleteCompte(@PathVariable("compteid") Long compteid)
    {
        compteService.delete(compteid);
    }
    // création d'un mappage de publication qui publie les détails de l'Compte dans la base de données
    @PostMapping("/compte")
    private Long saveUser(@RequestBody Compte compte)
    {
        compteService.saveOrUpdate(compte);
        return compte.getIdCompte();
    }
    // création d'un put mapping qui met à jour les détails de l'Compte
    @PutMapping("/compte")
    private Compte update(@RequestBody Compte compte)
    {
        compteService.saveOrUpdate(compte);
        return compte;
    }

}
