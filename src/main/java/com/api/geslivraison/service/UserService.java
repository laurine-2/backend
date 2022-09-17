package com.api.geslivraison.service;

import com.api.geslivraison.model.User;
import com.api.geslivraison.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    //obtenir tous les enregistrements de utilisateur en utilisant la méthode findaAll() de CrudRepository
    public List<User> getAllUser()
    {
        List<User> user = new ArrayList<User>();
        userRepository.findAll().forEach(user1 -> user.add(user1));
        return user;
    }
    //récupération d'un enregistrement spécifique en utilisant la méthode findById() de CrudRepository
    public User getUserById(Long idCompte)
    {
        return userRepository.findById(idCompte).get();
    }
    //sauvegarder un enregistrement spécifique en utilisant la méthode save() de CrudRepository
    public void saveOrUpdate(User user)
    {
        userRepository.save(user);
    }
    // suppression d'un enregistrement spécifique en utilisant la méthode deleteById() de CrudRepository
    public void delete(Long idCompte)
    {
        userRepository.deleteById(idCompte);
    }
    //mise à jour d'un enregistrement
    public void update(User user, Long userid)
    {
        userRepository.save(user);
    }

}
