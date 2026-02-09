package com.biblioteca.util;


import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import com.biblioteca.domain.notification.Notification;
import com.biblioteca.domain.notification.TypeNotification;
import com.biblioteca.service.NotificationService;

public class NotificationBus {

    private final Queue<Notification> queue = new LinkedList<>();
    private final NotificationService notificationService = new NotificationService();
    private final Thread worker;
    private boolean running = true;

    public NotificationBus() {
        worker = new Thread(new Worker(), "NotificationBus-Worker");
    }

    public void start() {
        worker.start();
    }

    public void stop() {
        synchronized (queue) {
            running = false;
            queue.notifyAll();
        }
    }

    public void publish(Notification notification) {
        synchronized (queue) {
            queue.add(notification);
            queue.notify(); // despierta al worker si estaba esperando
        }
    }

    private class Worker implements Runnable {
        @Override
        public void run() {
            while (true) {
                Notification msg;

                synchronized (queue) {
                    while (queue.isEmpty() && running) {
                        try {
                            queue.wait(); // duerme hasta que haya mensajes
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }

                    if (!running && queue.isEmpty()) {
                        return; // salida limpia
                    }

                    msg = queue.poll();
                }

                // Procesamiento fuera del synchronized
                notificationService.sendNotification(msg);

                try {
                    Thread.sleep(200); // simula trabajo
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
