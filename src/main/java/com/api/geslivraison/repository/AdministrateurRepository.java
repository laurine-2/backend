package com.api.geslivraison.repository;

import com.api.geslivraison.model.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {
}
