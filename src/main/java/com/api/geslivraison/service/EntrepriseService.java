package com.api.geslivraison.service;

import com.api.geslivraison.model.Entreprise;
import com.api.geslivraison.repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntrepriseService {
    @Autowired
    EntrepriseRepository entrepriseRepository;
    //obtenir tous les enregistrements de entreprise en utilisant la méthode findaAll() de CrudRepository
    public List<Entreprise> getAllEntreprise()
    {
        List<Entreprise> entreprise = new ArrayList<Entreprise>();
        entrepriseRepository.findAll().forEach(entreprise1 -> entreprise.add(entreprise1));
        return entreprise;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public Entreprise getEntrepriseById(Long idEntreprise)
    {
        return entrepriseRepository.findById(idEntreprise).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(Entreprise entreprise)
    {
        entrepriseRepository.save(entreprise);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idEntreprise)
    {
        entrepriseRepository.deleteById(idEntreprise);
    }
    //mise à jour d'un enregistrement
    public void update(Entreprise entreprise, Long entrepriseid)
    {
        entrepriseRepository.save(entreprise);
    }
}
