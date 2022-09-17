package com.api.geslivraison.controller;

import com.api.geslivraison.model.Administrateur;
import com.api.geslivraison.service.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class AdministrateurController {
    //autowire la classe AdministrateurService
    @Autowired
    AdministrateurService administrateurService;
    // création d'un mappage get qui récupère tous les détails des administrateur de la base de données
    @GetMapping("/Administrateur")
    private List<Administrateur> getAllAdministrateur()
    {
        return administrateurService.getAllAdministrateur();
    }
    // création d'un mappage get qui récupère le détail d'un administrateur spécifique
    @GetMapping("/administrateur/{administrateurid}")
    private Administrateur getAdministrateur(@PathVariable("administrateurid") Long administrateurid)
    {
        return administrateurService.getAdministrateurById(administrateurid);
    }
    // création d'un mappage de suppression qui supprime un administrateur spécifié
    @DeleteMapping("/administrateur/{administrateurid}")
    private void deleteAdministrateur(@PathVariable("administrateurid") Long administrateurid)
    {
        administrateurService.delete(administrateurid);
    }
    // création d'un mappage de publication qui publie les détails de l'administrateur dans la base de données
    @PostMapping("/administrateur")
    private Long saveAdministrateur(@RequestBody Administrateur administrateur)
    {
        administrateurService.saveOrUpdate(administrateur);
        return administrateur.getIdAdmiistrateur();
    }
    // création d'un put mapping qui met à jour les détails de l'administrateur
    @PutMapping("/administrateur")
    private Administrateur update(@RequestBody Administrateur administrateur)
    {
        administrateurService.saveOrUpdate(administrateur);
        return administrateur;
    }
}
