package com.ead.notification.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ead.notification.enums.NotificationStatus;
import com.ead.notification.models.NotificationModel;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationModel, UUID>{
	
	Page<NotificationModel> findAllByUserIdAndNotificationStatus(UUID userId, NotificationStatus notificationStatus, Pageable pageable);
	Optional<NotificationModel> findByNotificationIdAndUserId(UUID notificationId, UUID userId);

}
