package com.api.geslivraison.service;

import com.api.geslivraison.model.Livreur;
import com.api.geslivraison.repository.LivreurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivreurService {
    @Autowired
    LivreurRepository livreurRepository;
    //obtenir tous les enregistrements de livreur en utilisant la méthode findaAll() de CrudRepository
    public List<Livreur> getAllLivreur()
    {
        List<Livreur> livreur = new ArrayList<Livreur>();
        livreurRepository.findAll().forEach(livreur1 -> livreur.add(livreur1));
        return livreur;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public Livreur getLivreurById(Long idLivreur)
    {
        return livreurRepository.findById(idLivreur).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(Livreur livreur)
    {
        livreurRepository.save(livreur);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idLivreur)
    {
        livreurRepository.deleteById(idLivreur);
    }
    //mise à jour d'un enregistrement
    public void update(Livreur livreur, Long livreurid)
    {
        livreurRepository.save(livreur);
    }
}
