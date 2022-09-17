package com.api.geslivraison.service;

import com.api.geslivraison.model.Payement;
import com.api.geslivraison.repository.PayementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PayementService {
    @Autowired
    PayementRepository payementRepository;
    //obtenir tous les enregistrements de utilisateur en utilisant la méthode findaAll() de CrudRepository
    public List<Payement> getAllPayement()
    {
        List<Payement> payement = new ArrayList<Payement>();
        payementRepository.findAll().forEach(payement1 -> payement.add(payement1));
        return payement;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public Payement getPayementById(Long idPayement)
    {
        return payementRepository.findById(idPayement).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(Payement payement)
    {
        payementRepository.save(payement);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idPayement)
    {
        payementRepository.deleteById(idPayement);
    }
    //mise à jour d'un enregistrement
    public void update(Payement payement, Long payementid)
    {
        payementRepository.save(payement);
    }
}
