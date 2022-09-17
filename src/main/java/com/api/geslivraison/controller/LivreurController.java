package com.api.geslivraison.controller;

import com.api.geslivraison.model.Livreur;
import com.api.geslivraison.service.LivreurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class LivreurController {
    //autowire la classe UserService
    @Autowired
    LivreurService livreurService;
    // création d'un mappage get qui récupère tous les détails des livreur de la base de données
    @GetMapping("/Livreur")
    private List<Livreur> getAllLivreur()
    {
        return livreurService.getAllLivreur();
    }
    // création d'un mappage get qui récupère le détail d'un livreur spécifique
    @GetMapping("/livreur/{livreurid}")
    private Livreur getLivreur(@PathVariable("livreurid") Long livreurid)
    {
        return livreurService.getLivreurById(livreurid);
    }
    // création d'un mappage de suppression qui supprime un livreur spécifié
    @DeleteMapping("/livreur/{livreurid}")
    private void deleteLivreur(@PathVariable("livreurid") Long livreurid)
    {
        livreurService.delete(livreurid);
    }
    // création d'un mappage de publication qui publie les détails de l'livreur dans la base de données
    @PostMapping("/livreur")
    private Long saveLivreur(@RequestBody Livreur livreur)
    {
        livreurService.saveOrUpdate(livreur);
        return livreur.getIdLivreur();
    }
    // création d'un put mapping qui met à jour les détails de l'livreur
    @PutMapping("/livreur")
    private Livreur update(@RequestBody Livreur livreur)
    {
        livreurService.saveOrUpdate(livreur);
        return livreur;
    }
}
