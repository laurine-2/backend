package com.api.geslivraison.service;

import com.api.geslivraison.model.TypeNotification;
import com.api.geslivraison.repository.TypeNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TypeNotificationService {
    @Autowired
    TypeNotificationRepository typeNotificationRepository;
    //obtenir tous les enregistrements de utilisateur en utilisant la méthode findaAll() de CrudRepository
    public List<TypeNotification> getAllTypeNotification()
    {
        List<TypeNotification> typeNotification = new ArrayList<TypeNotification>();
        typeNotificationRepository.findAll().forEach(typeNotification1 -> typeNotification.add(typeNotification1));
        return typeNotification;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public TypeNotification getTypeNotificationById(Long idTypeNotification)
    {
        return typeNotificationRepository.findById(idTypeNotification).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(TypeNotification typeNotification)
    {
        typeNotificationRepository.save(typeNotification);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idTypeNotification)
    {
        typeNotificationRepository.deleteById(idTypeNotification);
    }
    //mise à jour d'un enregistrementd
    public void update(TypeNotification typeNotification, Long typeNotificationid)
    {
        typeNotificationRepository.save(typeNotification);
    }

}
