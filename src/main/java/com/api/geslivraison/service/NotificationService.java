package com.api.geslivraison.service;

import com.api.geslivraison.model.Notification;
import com.api.geslivraison.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotificationService {
    @Autowired
    NotificationRepository notificationRepository;
    //obtenir tous les enregistrements de notification en utilisant la méthode findaAll() de CrudRepository
    public List<Notification> getAllNotification()
    {
        List<Notification> notification = new ArrayList<Notification>();
        notificationRepository.findAll().forEach(notification1 -> notification.add(notification1));
        return notification;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public Notification getNotificationById(Long idNotification)
    {
        return notificationRepository.findById(idNotification).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(Notification notification)
    {
        notificationRepository.save(notification);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idNotification)
    {
        notificationRepository.deleteById(idNotification);
    }
    //mise à jour d'un enregistrement
    public void update(Notification notification, Long notificationid)
    {
        notificationRepository.save(notification);
    }
}
