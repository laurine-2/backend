package com.api.geslivraison.repository;

import com.api.geslivraison.model.FormulaireLivraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormulaireLivraisonRepository extends JpaRepository<FormulaireLivraison, Long> {
}
