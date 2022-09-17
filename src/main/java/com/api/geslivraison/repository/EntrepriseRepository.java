package com.api.geslivraison.repository;

import com.api.geslivraison.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
    boolean existsByNomEntreprise(String nomEntreprise);

    boolean existsByNomEntrepriseAndCertif(String nomEntreprise, String certif);

    Entreprise findByNomEntrepriseAndCertif(String nomEntreprise, String certif);
}
