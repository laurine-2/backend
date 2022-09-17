package com.api.geslivraison.controller;

import com.api.geslivraison.model.FormulaireLivraison;
import com.api.geslivraison.model.User;
import com.api.geslivraison.service.FormulaireLivraisonService;
import com.api.geslivraison.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class FormulaireLivraisonController {
    //autowire la classe FormulaireLivraisonService
    @Autowired
    FormulaireLivraisonService formulaireLivraisonService;
    // création d'un mappage get qui récupère tous les détails des FormulaireLivraison de la base de données
    @GetMapping("/formulaireLivraison")
    private List<FormulaireLivraison> getAllFormulaireLivraison()
    {
        return formulaireLivraisonService.getAllFormulaireLivraison();
    }
    // création d'un mappage get qui récupère le détail d'un FormulaireLivraison spécifique
    @GetMapping("/formulaireLivraison/{formulaireLivraisonid}")
    private FormulaireLivraison getFormulaireLivraison(@PathVariable("formulaireLivraisonid") Long formulaireLivraisonid)
    {
        return formulaireLivraisonService.getFormulaireLivraisonById(formulaireLivraisonid);
    }
    // création d'un mappage de suppression qui supprime un FormulaireLivraison spécifié
    @DeleteMapping("/formulaireLivraison/{formulaireLivraisonid}")
    private void deleteFormulaireLivraison(@PathVariable("formulaireLivraisonid") Long formulaireLivraisonid)
    {
        formulaireLivraisonService.delete(formulaireLivraisonid);
    }
    // création d'un mappage de publication qui publie les détails de l'FormulaireLivraison dans la base de données
    @PostMapping("/formulaireLivraison")
    private Long saveFormulaireLivraison(@RequestBody FormulaireLivraison formulaireLivraison)
    {
        formulaireLivraison.setEtatDemande("EN_COURS");
        formulaireLivraisonService.saveOrUpdate(formulaireLivraison);
        return formulaireLivraison.getIdFormulaireLivraison();
    }
    // création d'un put mapping qui met à jour les détails de l'FormulaireLivraison
    @PutMapping("/formulaireLivraison")
    private FormulaireLivraison update(@RequestBody FormulaireLivraison formulaireLivraison)
    {
        formulaireLivraisonService.saveOrUpdate(formulaireLivraison);
        return formulaireLivraison;
    }
//    @PutMapping("/formulaireLivraison")
//    private FormulaireLivraison updateEtat(@RequestBody FormulaireLivraison formulaireLivraison)
//    {
//        formulaireLivraisonService.saveOrUpdate(formulaireLivraison);
//        return formulaireLivraison;
//    }
}
