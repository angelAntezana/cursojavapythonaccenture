package com.biblioteca.service;

import com.biblioteca.domain.notification.Notification;
import com.biblioteca.domain.notification.TypeNotification;

public class NotificationFactory {
    
    private NotificationFactory() {
    }

    public static NotificationChannel create(Notification notification) {
        TypeNotification typeNotification = notification.getTypeNotification();
        return switch (typeNotification) {
            case EMAIL -> new EmailService();
            case MOVIL -> new PushService();
            default -> throw new IllegalArgumentException("Notificación desconocida"); 
        };
    }
}
