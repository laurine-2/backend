package com.api.geslivraison.service;

import com.api.geslivraison.model.Permis;
import com.api.geslivraison.repository.PermisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermisService {
    @Autowired
    PermisRepository permisRepository;
    //obtenir tous les enregistrements de utilisateur en utilisant la méthode findaAll() de CrudRepository
    public List<Permis> getAllPermis()
    {
        List<Permis> permis = new ArrayList<Permis>();
        permisRepository.findAll().forEach(permis1 -> permis.add(permis1));
        return permis;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public Permis getPermisById(Long idPermis)
    {
        return permisRepository.findById(idPermis).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(Permis permis)
    {
        permisRepository.save(permis);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idPermis)
    {
        permisRepository.deleteById(idPermis);
    }
    //mise à jour d'un enregistrement
    public void update(Permis permis, Long permisid)
    {
        permisRepository.save(permis);
    }

}
