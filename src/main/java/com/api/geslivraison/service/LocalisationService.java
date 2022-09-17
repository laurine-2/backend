package com.api.geslivraison.service;

import com.api.geslivraison.model.Localisation;
import com.api.geslivraison.repository.LocalisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocalisationService {
    @Autowired
    LocalisationRepository localisationRepository;
    //obtenir tous les enregistrements de localisation en utilisant la méthode findaAll() de CrudRepository
    public List<Localisation> getAllLocalisation()
    {
        List<Localisation> localisation = new ArrayList<Localisation>();
        localisationRepository.findAll().forEach(localisation1 -> localisation.add(localisation1));
        return localisation;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public Localisation getLocalisationById(Long idLocalisation)
    {
        return localisationRepository.findById(idLocalisation).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(Localisation localisation)
    {
        localisationRepository.save(localisation);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idLocalisation)
    {
        localisationRepository.deleteById(idLocalisation);
    }
    //mise à jour d'un enregistrement
    public void update(Localisation localisation, Long localisationid)
    {
        localisationRepository.save(localisation);
    }
}
