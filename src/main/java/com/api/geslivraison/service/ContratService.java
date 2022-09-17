package com.api.geslivraison.service;

import com.api.geslivraison.model.Contrat;
import com.api.geslivraison.repository.ContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContratService {
    @Autowired
    ContratRepository contratRepository;
    //obtenir tous les enregistrements de contrat en utilisant la méthode findaAll() de CrudRepository
    public List<Contrat> getAllContrat()
    {
        List<Contrat> contrat = new ArrayList<Contrat>();
        contratRepository.findAll().forEach(contrat1 -> contrat.add(contrat1));
        return contrat;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public Contrat getContratById(Long idContrat)
    {
        return contratRepository.findById(idContrat).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(Contrat contrat)
    {
        contratRepository.save(contrat);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idContrat)
    {
        contratRepository.deleteById(idContrat);
    }
    //mise à jour d'un enregistrement
    public void update(Contrat contrat, Long contratid)
    {
        contratRepository.save(contrat);
    }

}
