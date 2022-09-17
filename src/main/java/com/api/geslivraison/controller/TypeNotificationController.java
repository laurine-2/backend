package com.api.geslivraison.controller;

import com.api.geslivraison.model.TypeNotification;
import com.api.geslivraison.service.TypeNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class TypeNotificationController {
    //autowire la classe UserService
    @Autowired
    TypeNotificationService typeNotificationService;
    // création d'un mappage get qui récupère tous les détails des utilisateur de la base de données
    @GetMapping("/typeNotification")
    private List<TypeNotification> getAllTypeNotification()
    {
        return typeNotificationService.getAllTypeNotification();
    }
    // création d'un mappage get qui récupère le détail d'un utilisateur spécifique
    @GetMapping("/typeNotification/{typeNotificationid}")
    private TypeNotification getTypeNotification(@PathVariable("typeNotificationid") Long typeNotificationid)
    {
        return typeNotificationService.getTypeNotificationById(typeNotificationid);
    }
    // création d'un mappage de suppression qui supprime un utilisateur spécifié
    @DeleteMapping("/typeNotification/{typeNotificationid}")
    private void deleteTypeNotification(@PathVariable("typeNotificationid") Long typeNotificationid)
    {
        typeNotificationService.delete(typeNotificationid);
    }
    // création d'un mappage de publication qui publie les détails de l'utilisateur dans la base de données
    @PostMapping("/typeNotification")
    private Long saveTypeNotification(@RequestBody TypeNotification typeNotification)
    {
        typeNotificationService.saveOrUpdate(typeNotification);
        return typeNotification.getIdTypeNotification();
    }
    // création d'un put mapping qui met à jour les détails de l'utilisateur
    @PutMapping("/typeNotification")
    private TypeNotification update(@RequestBody TypeNotification typeNotification)
    {
        typeNotificationService.saveOrUpdate(typeNotification);
        return typeNotification;
    }
}
