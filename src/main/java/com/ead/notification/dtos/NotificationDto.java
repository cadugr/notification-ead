package com.ead.notification.dtos;

import javax.validation.constraints.NotNull;

import com.ead.notification.enums.NotificationStatus;

public class NotificationDto {
	
	@NotNull
	private NotificationStatus notificationStatus;

	public NotificationStatus getNotificationStatus() {
		return notificationStatus;
	}

	public void setNotificationStatus(NotificationStatus notificationStatus) {
		this.notificationStatus = notificationStatus;
	}
	

}
