package com.api.geslivraison.controller;

import com.api.geslivraison.model.Entreprise;
import com.api.geslivraison.payloads.Connexion;
import com.api.geslivraison.payloads.SignUp;
import com.api.geslivraison.repository.EntrepriseRepository;
import com.api.geslivraison.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.LdapShaPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class EntrepriseController {
    //autowire la classe EntrepriseService
    @Autowired
    EntrepriseService entrepriseService;
    @Autowired
    EntrepriseRepository entrepriseRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private Logger logger = Logger.getLogger(EntrepriseController.class.getName());

    // création d'un mappage get qui récupère tous les détails des Entreprise de la base de données
    @GetMapping("/Entreprise")
    private List<Entreprise> getAllEntreprise()
    {
        return entrepriseService.getAllEntreprise();
    }
    // création d'un mappage get qui récupère le détail d'un l'Entreprise spécifique
    @GetMapping("/entreprise/{entrepriseid}")
    private Entreprise getUser(@PathVariable("entrepriseid") Long entrepriseid)
    {
        return entrepriseService.getEntrepriseById(entrepriseid);
    }
    @GetMapping("/entreprise/connexion")
    private Entreprise connexion(@RequestParam("entrepriseid") Long entrepriseid)
    {
        return entrepriseService.getEntrepriseById(entrepriseid);
    }
    // création d'un mappage de suppression qui supprime une Entreprise spécifié
    @DeleteMapping("/entreprise/{entrepriseid}")
    private void deleteEntreprise(@PathVariable("entrepriseid") Long entrepriseid)
    {
        entrepriseService.delete(entrepriseid);
    }
    // création d'un mappage de publication qui publie les détails de l'Entreprise dans la base de données
    @PostMapping("/entreprise")
    private ResponseEntity<?> saveEntreprise(@RequestBody SignUp signUp)
    {
        if(entrepriseRepository.existsByNomEntreprise(signUp.getNomEntreprise())){
            return new ResponseEntity("existe deja" , HttpStatus.INTERNAL_SERVER_ERROR) ;
        }else {
            Entreprise entreprise = new Entreprise(signUp.getNomEntreprise(), signUp.getStatut(),signUp.getRegistreCommerce() , signUp.getCarteContribuable(), signUp.getPassword() , signUp.getNonRedevance() , signUp.getPassword());
            entreprise.setPassword(passwordEncoder.encode(signUp.getPassword()));

            System.out.println(entreprise.getPassword());
            System.out.println(entreprise.toString());
            entrepriseService.saveOrUpdate(entreprise);
            return  new ResponseEntity(entreprise.getIdEntreprise() , HttpStatus.OK) ;
        }
    }

    @PostMapping("/connexion")
    private ResponseEntity<?> connexion(@RequestBody Connexion connexion)
    {
        if(entrepriseRepository.existsByNomEntrepriseAndCertif(connexion.getUsername() , connexion.getPassword())){
            Entreprise entreprise = new Entreprise();
            entreprise = entrepriseRepository.findByNomEntrepriseAndCertif(connexion.getUsername() , connexion.getPassword());

            return new ResponseEntity(entreprise.getIdEntreprise() , HttpStatus.OK) ;
        }else {

            return  new ResponseEntity("il etait pas la " , HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
    }


    // création d'un put mapping qui met à jour les détails de l'utilisateur
    @PutMapping("/entreprise")
    private Entreprise update(@RequestBody Entreprise entreprise)
    {
        entrepriseService.saveOrUpdate(entreprise);
        return entreprise;
    }
}
