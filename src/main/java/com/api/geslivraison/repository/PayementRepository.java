package com.api.geslivraison.repository;

import com.api.geslivraison.model.Payement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayementRepository extends JpaRepository<Payement, Long> {
}
