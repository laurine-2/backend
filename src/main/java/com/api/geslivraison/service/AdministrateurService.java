package com.api.geslivraison.service;

import com.api.geslivraison.model.Administrateur;
import com.api.geslivraison.repository.AdministrateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdministrateurService {
    @Autowired
    AdministrateurRepository administrateurRepository;
    //obtenir tous les enregistrements de utilisateur en utilisant la méthode findaAll() de CrudRepository
    public List<Administrateur> getAllAdministrateur()
    {
        List<Administrateur> administrateur = new ArrayList<Administrateur>();
        administrateurRepository.findAll().forEach(administrateur1 -> administrateur.add(administrateur1));
        return administrateur;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public Administrateur getAdministrateurById(Long idAdministrateur)
    {
        return administrateurRepository.findById(idAdministrateur).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(Administrateur administrateur)
    {
        administrateurRepository.save(administrateur);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idAdministrateur)
    {
        administrateurRepository.deleteById(idAdministrateur);
    }
    //mise à jour d'un enregistrement
    public void update(Administrateur administrateur, Long administrateurid)
    {
        administrateurRepository.save(administrateur);
    }
}
