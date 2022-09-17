package com.api.geslivraison.service;


import com.api.geslivraison.model.Livraison;
import com.api.geslivraison.repository.LivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivraisonService {

    @Autowired
    LivraisonRepository livraisonRepository;
    //obtenir tous les enregistrements de livraison en utilisant la méthode findaAll() de CrudRepository
    public List<Livraison> getAllLivraison()
    {
        List<Livraison> livraison = new ArrayList<Livraison>();
        livraisonRepository.findAll().forEach(livraison1 -> livraison.add(livraison1));
        return livraison;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public Livraison getLivraisonById(Long idLivraison)
    {
        return livraisonRepository.findById(idLivraison).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(Livraison livraison)
    {
        livraisonRepository.save(livraison);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idLivraison)
    {
        livraisonRepository.deleteById(idLivraison);
    }
    //mise à jour d'un enregistrement
    public void update(Livraison livraison, Long livraisonid)
    {
        livraisonRepository.save(livraison);
    }

}
