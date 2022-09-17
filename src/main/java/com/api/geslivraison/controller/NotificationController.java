package com.api.geslivraison.controller;

import com.api.geslivraison.model.Notification;
import com.api.geslivraison.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class NotificationController {
    //autowire la classe UserService
    @Autowired
    NotificationService notificationService;
    // création d'un mappage get qui récupère tous les détails des utilisateur de la base de données
    @GetMapping("/notification")
    private List<Notification> getAllNotification()
    {
        return notificationService.getAllNotification();
    }
    // création d'un mappage get qui récupère le détail d'un utilisateur spécifique
    @GetMapping("/notification/{notificationid}")
    private Notification getNotification(@PathVariable("notificationid") Long notificationid)
    {
        return notificationService.getNotificationById(notificationid);
    }
    // création d'un mappage de suppression qui supprime un utilisateur spécifié
    @DeleteMapping("/notification/{notificationid}")
    private void deleteUser(@PathVariable("notificationid") Long notificationid)
    {
        notificationService.delete(notificationid);
    }
    // création d'un mappage de publication qui publie les détails de l'utilisateur dans la base de données
    @PostMapping("/notification")
    private Long saveNotification(@RequestBody Notification notification)
    {
        notificationService.saveOrUpdate(notification);
        return notification.getIdNotification();
    }
    // création d'un put mapping qui met à jour les détails de l'utilisateur
    @PutMapping("/notification")
    private Notification update(@RequestBody Notification notification)
    {
        notificationService.saveOrUpdate(notification);
        return notification;
    }
}
