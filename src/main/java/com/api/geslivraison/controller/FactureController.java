package com.api.geslivraison.controller;

import com.api.geslivraison.model.Facture;
import com.api.geslivraison.service.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class FactureController {
    //autowire la classe FactureService
    @Autowired
    FactureService factureService;
    // création d'un mappage get qui récupère tous les détails des facture de la base de données
    @GetMapping("/facture")
    private List<Facture> getAllFacture()
    {
        return factureService.getAllFacture();
    }
    // création d'un mappage get qui récupère le détail d'une facture spécifique
    @GetMapping("/facture/{factureid}")
    private Facture getFacture(@PathVariable("factureid") Long factureid)
    {
        return factureService.getFactureById(factureid);
    }
    // création d'un mappage de suppression qui supprime un facture spécifié
    @DeleteMapping("/facture/{factureid}")
    private void deleteUser(@PathVariable("factureid") Long factureid)
    {
        factureService.delete(factureid);
    }
    // création d'un mappage de publication qui publie les détails de l'facture dans la base de données
    @PostMapping("/facture")
    private Long saveFcature(@RequestBody Facture facture)
    {
        factureService.saveOrUpdate(facture);
        return facture.getIdFacture();
    }
    // création d'un put mapping qui met à jour les détails de l'facture
    @PutMapping("/facture")
    private Facture update(@RequestBody Facture facture)
    {
        factureService.saveOrUpdate(facture);
        return facture;
    }
}
