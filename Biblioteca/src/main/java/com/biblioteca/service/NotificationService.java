package com.biblioteca.service;

import com.biblioteca.domain.notification.Notification;

public class NotificationService {
    public void sendNotification(Notification notification) {
        NotificationChannel notificationChannel = NotificationFactory.create(notification);
        notificationChannel.send(notification.getMessage());
    }
}
