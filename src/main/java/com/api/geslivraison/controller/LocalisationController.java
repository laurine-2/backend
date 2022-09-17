package com.api.geslivraison.controller;

import com.api.geslivraison.model.Localisation;
import com.api.geslivraison.service.LocalisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class LocalisationController {
    //autowire la classe LocalisationService
    @Autowired
    LocalisationService localisationService;
    // création d'un mappage get qui récupère tous les détails des Localisation de la base de données
    @GetMapping("/localisation")
    private List<Localisation> getAllLocalisation()
    {
        return localisationService.getAllLocalisation();
    }
    // création d'un mappage get qui récupère le détail d'un Localisation spécifique
    @GetMapping("/localisation/{localisationid}")
    private Localisation getLocalisation(@PathVariable("localisationid") Long localisationid)
    {
        return localisationService.getLocalisationById(localisationid);
    }
    // création d'un mappage de suppression qui supprime un Localisation spécifié
    @DeleteMapping("/localisation/{localisationid}")
    private void deleteLocalisation(@PathVariable("localisationid") Long localisationid)
    {
        localisationService.delete(localisationid);
    }
    // création d'un mappage de publication qui publie les détails de l'Localisation dans la base de données
    @PostMapping("/localisation")
    private Long saveLocalisation(@RequestBody Localisation localisation)
    {
        localisationService.saveOrUpdate(localisation);
        return localisation.getIdLocalisation();
    }
    // création d'un put mapping qui met à jour les détails de l'Localisation
    @PutMapping("/localisation")
    private Localisation update(@RequestBody Localisation localisation)
    {
        localisationService.saveOrUpdate(localisation);
        return localisation;
    }
}
