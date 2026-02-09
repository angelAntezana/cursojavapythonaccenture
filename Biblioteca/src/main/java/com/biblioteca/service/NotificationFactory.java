package com.biblioteca.service;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

import com.biblioteca.domain.notification.Notification;
import com.biblioteca.domain.notification.TypeNotification;

public class NotificationFactory {

    private static final Map<TypeNotification, Supplier<? extends NotificationChannel>> notificationMap = Map.of(
        TypeNotification.EMAIL, EmailService::new,
        TypeNotification.MOVIL, PushService::new);

    public static NotificationChannel create(Notification notification) {
        TypeNotification typeNotification = notification.getTypeNotification();
        
        return Optional.ofNullable(notificationMap.get(typeNotification))
                       .map(Supplier::get)
                       .orElseThrow(() ->
                           new IllegalArgumentException("Tipo de notificación desconocida: " + typeNotification)
                       );

    }
}
