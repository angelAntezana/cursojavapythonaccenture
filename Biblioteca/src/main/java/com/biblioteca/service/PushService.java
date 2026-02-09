package com.biblioteca.service;

import com.biblioteca.util.LoggerUtil;

public class PushService implements NotificationChannel{

    LoggerUtil log = LoggerUtil.getInstance();
    @Override
    public void send(String message) {
        log.info("Se ha enviado una notificación al movil: " + message);
    }
    
}
