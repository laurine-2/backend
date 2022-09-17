package com.api.geslivraison.service;

import com.api.geslivraison.model.Compte;
import com.api.geslivraison.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompteService {
    @Autowired
    CompteRepository compteRepository;
    //obtenir tous les enregistrements de compte en utilisant la méthode findaAll() de CrudRepository
    public List<Compte> getAllCompte()
    {
        List<Compte> compte = new ArrayList<Compte>();
        compteRepository.findAll().forEach(compte1 -> compte.add(compte1));
        return compte;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public Compte getCompteById(Long idCompte)
    {
        return compteRepository.findById(idCompte).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(Compte compte)
    {
        compteRepository.save(compte);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idCompte)
    {
        compteRepository.deleteById(idCompte);
    }
    //mise à jour d'un enregistrement
    public void update(Compte compte, Long compteid)
    {
        compteRepository.save(compte);
    }
}
