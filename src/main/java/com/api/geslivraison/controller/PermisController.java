package com.api.geslivraison.controller;

import com.api.geslivraison.model.Permis;
import com.api.geslivraison.model.User;
import com.api.geslivraison.service.PermisService;
import com.api.geslivraison.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")

public class PermisController {

    //autowire la classe UserService
    @Autowired
    PermisService permisService;
    // création d'un mappage get qui récupère tous les détails des utilisateur de la base de données
    @GetMapping("/permis")
    private List<Permis> getAllPermis()
    {
        return permisService.getAllPermis();
    }
    // création d'un mappage get qui récupère le détail d'un utilisateur spécifique
    @GetMapping("/permis/{permisid}")
    private Permis getPermis(@PathVariable("permisid") Long permisid)
    {
        return permisService.getPermisById(permisid);
    }
    // création d'un mappage de suppression qui supprime un utilisateur spécifié
    @DeleteMapping("/permis/{permisid}")
    private void deletePermis(@PathVariable("permisid") Long permisid)
    {
        permisService.delete(permisid);
    }
    // création d'un mappage de publication qui publie les détails de l'utilisateur dans la base de données
    @PostMapping("/permis")
    private Long savePermis(@RequestBody Permis permis)
    {
        permisService.saveOrUpdate(permis);
        return permis.getIdPermis();
    }
    // création d'un put mapping qui met à jour les détails de l'utilisateur
    @PutMapping("/permis")
    private Permis update(@RequestBody Permis permis)
    {
        permisService.saveOrUpdate(permis);
        return permis;
    }
}
