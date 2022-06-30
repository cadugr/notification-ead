package com.ead.notification.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ead.notification.models.NotificationModel;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationModel, UUID>{

}
