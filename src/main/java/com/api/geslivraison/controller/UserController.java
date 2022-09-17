package com.api.geslivraison.controller;

import com.api.geslivraison.model.User;
import com.api.geslivraison.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@EnableWebSecurity
@RequestMapping("/api")
public class UserController {
    //autowire la classe UserService
    @Autowired
    UserService userService;
    // création d'un mappage get qui récupère tous les détails des utilisateur de la base de données
    @GetMapping("/utilisateur")
    private List<User> getAllUser()
    {
        return userService.getAllUser();
    }
    // création d'un mappage get qui récupère le détail d'un utilisateur spécifique
    @GetMapping("/user/{userid}")
    private User getUser(@PathVariable("userid") Long userid)
    {
        return userService.getUserById(userid);
    }
    // création d'un mappage de suppression qui supprime un utilisateur spécifié
    @DeleteMapping("/user/{userid}")
    private void deleteUser(@PathVariable("userid") Long userid)
    {
        userService.delete(userid);
    }
    // création d'un mappage de publication qui publie les détails de l'utilisateur dans la base de données
    @PostMapping("/user")
    private Long saveUser(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user.getIdCompte();
    }
    // création d'un put mapping qui met à jour les détails de l'utilisateur
    @PutMapping("/user")
    private User update(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user;
    }
}
