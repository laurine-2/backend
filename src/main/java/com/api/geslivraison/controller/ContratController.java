package com.api.geslivraison.controller;

import com.api.geslivraison.model.Contrat;
import com.api.geslivraison.service.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class ContratController {
    //autowire la classe contratService
    @Autowired
    ContratService contratService;
    // création d'un mappage get qui récupère tous les détails des contrat de la base de données
    @GetMapping("/contrat")
    private List<Contrat> getAllContrat()
    {
        return contratService.getAllContrat();
    }
    // création d'un mappage get qui récupère le détail d'un contrat spécifique
    @GetMapping("/contrat/{contratid}")
    private Contrat getContrat(@PathVariable("contratid") Long contratid)
    {
        return contratService.getContratById(contratid);
    }
    // création d'un mappage de suppression qui supprime un contrat spécifié
    @DeleteMapping("/contrat/{contratid}")
    private void deleteContrat(@PathVariable("contratid") Long contratid)
    {
        contratService.delete(contratid);
    }
    // création d'un mappage de publication qui publie les détails de l'contrat dans la base de données
    @PostMapping("/contrat")
    private Long saveContrat(@RequestBody Contrat contrat)
    {
        contratService.saveOrUpdate(contrat);
        return contrat.getIdContrat();
    }
    // création d'un put mapping qui met à jour les détails de l'contrat
    @PutMapping("/contrat")
    private Contrat update(@RequestBody Contrat contrat)
    {
        contratService.saveOrUpdate(contrat);
        return contrat;
    }
}
