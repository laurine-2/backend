package com.api.geslivraison.repository;

import com.api.geslivraison.model.TypeNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeNotificationRepository extends JpaRepository<TypeNotification, Long> {
}
