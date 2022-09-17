package com.api.geslivraison.service;

import com.api.geslivraison.model.FormulaireLivraison;
import com.api.geslivraison.repository.FormulaireLivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FormulaireLivraisonService {
    @Autowired
    FormulaireLivraisonRepository formulaireLivraisonRepository;
    //obtenir tous les enregistrements de formulaire en utilisant la méthode findaAll() de CrudRepository
    public List<FormulaireLivraison> getAllFormulaireLivraison()
    {
        List<FormulaireLivraison> formulaireLivraison = new ArrayList<FormulaireLivraison>();
        formulaireLivraisonRepository.findAll().forEach(formulaireLivraison1 -> formulaireLivraison.add(formulaireLivraison1));
        return formulaireLivraison;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public FormulaireLivraison getFormulaireLivraisonById(Long idFormulaireLivraison)
    {
        return formulaireLivraisonRepository.findById(idFormulaireLivraison).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(FormulaireLivraison formulaireLivraison)
    {
        formulaireLivraisonRepository.save(formulaireLivraison);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idFormulaireLivraison)
    {
        formulaireLivraisonRepository.deleteById(idFormulaireLivraison);
    }
    //mise à jour d'un enregistrement
    public void update(FormulaireLivraison formulaireLivraison, Long formulaireLivraisonid)
    {
        formulaireLivraisonRepository.save(formulaireLivraison);
    }
}
