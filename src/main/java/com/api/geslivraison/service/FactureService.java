package com.api.geslivraison.service;

import com.api.geslivraison.model.Facture;
import com.api.geslivraison.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FactureService {
    @Autowired
    FactureRepository factureRepository;
    //obtenir tous les enregistrements de facture en utilisant la méthode findaAll() de CrudRepository
    public List<Facture> getAllFacture()
    {
        List<Facture> facture = new ArrayList<Facture>();
        factureRepository.findAll().forEach(facture1 -> facture.add(facture1));
        return facture;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public Facture getFactureById(Long idFacture)
    {
        return factureRepository.findById(idFacture).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(Facture facture)
    {
        factureRepository.save(facture);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idFacture)
    {
        factureRepository.deleteById(idFacture);
    }
    //mise à jour d'un enregistrement
    public void update(Facture facture, Long factureid)
    {
        factureRepository.save(facture);
    }
}
