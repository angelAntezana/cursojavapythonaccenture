package com.biblioteca.domain.notification;

public class Notification {
    
    private TypeNotification typeNotification;
    private String message;
    public Notification(TypeNotification typeNotification, String message) {
        this.typeNotification = typeNotification;
        this.message = message;
    }
    public TypeNotification getTypeNotification() {
        return typeNotification;
    }
    public void setTypeNotification(TypeNotification typeNotification) {
        // Por defecto será EMAIL
        if (typeNotification == null) {
            typeNotification = TypeNotification.EMAIL;
        }
        this.typeNotification = typeNotification;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    
}
