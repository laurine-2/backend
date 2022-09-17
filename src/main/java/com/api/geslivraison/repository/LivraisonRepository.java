package com.api.geslivraison.repository;


import com.api.geslivraison.model.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivraisonRepository extends JpaRepository<Livraison,Long> {
}
