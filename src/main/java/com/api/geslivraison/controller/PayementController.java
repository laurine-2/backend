package com.api.geslivraison.controller;

import com.api.geslivraison.model.Payement;
import com.api.geslivraison.service.PayementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class PayementController {
    //autowire la classe UserService
    @Autowired
    PayementService payementService;
    // création d'un mappage get qui récupère tous les détails des utilisateur de la base de données
    @GetMapping("/Payement")
    private List<Payement> getAllPayement()
    {
        return payementService.getAllPayement();
    }
    // création d'un mappage get qui récupère le détail d'un utilisateur spécifique
    @GetMapping("/payement/{payementid}")
    private Payement getUser(@PathVariable("payementid") Long payementid)
    {
        return payementService.getPayementById(payementid);
    }
    // création d'un mappage de suppression qui supprime un utilisateur spécifié
    @DeleteMapping("/payement/{payementid}")
    private void deleteUser(@PathVariable("payementid") Long payementid)
    {
        payementService.delete(payementid);
    }
    // création d'un mappage de publication qui publie les détails de l'utilisateur dans la base de données
    @PostMapping("/payement")
    private Long savePayement(@RequestBody Payement payement)
    {
        payementService.saveOrUpdate(payement);
        return payement.getIdPayement();
    }
    // création d'un put mapping qui met à jour les détails de l'utilisateur
    @PutMapping("/payement")
    private Payement update(@RequestBody Payement payement)
    {
        payementService.saveOrUpdate(payement);
        return payement;
    }
}
