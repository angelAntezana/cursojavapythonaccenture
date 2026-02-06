package com.biblioteca.domain.notification;

public class NotificationBussApp {
    void main() {
        NotificationBus notificationBus = new NotificationBus();
        notificationBus.start();
        notificationBus.publish("Mensaje1");
        notificationBus.publish("Mensaje2");
        notificationBus.stop();
    
        //TO DO

        // NotificationBus bus = new NotificationBus();
        // bus.start();
        // bus.addChannel(new ConsoleChannel());
        // bus.addChannel(new KafkaChannel());
        // bus.publish("Usuario registrado");
        // bus.publish("Préstamo creado");
        // bus.publish("Animal alimentado");
        // bus.publish("Gol minuto 32");

        // try {
        //     Thread.sleep(1000);
        //     bus.stop();
        // } catch (InterruptedException _) {
        //     IO.println("Se ha producido una exception");
        // }
    }
    
}
