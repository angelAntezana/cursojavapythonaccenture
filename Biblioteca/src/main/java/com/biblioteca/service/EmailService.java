package com.biblioteca.service;

import java.time.LocalDate;

import com.biblioteca.domain.libro.Libro;
import com.biblioteca.domain.usuario.Usuario;
import com.biblioteca.util.LoggerUtil;

public class EmailService {
    
    LoggerUtil log = LoggerUtil.getInstance();

    public EmailService() {
    }

    private String contruirMensaje(Usuario usuario, Libro libro, LocalDate diaReserva){
        StringBuilder message = new StringBuilder();
        message.append("Hola ");
        message.append(usuario.getNombre());
        message.append(" se ha reservado el libro ");
        message.append(libro.getTitulo());
        message.append(" para el día ");
        message.append(diaReserva);
        message.append("\nUn saludo y gracias por su interés en nuestra biblioteca");
        return message.toString();
    }

    public void enviarEmail(Usuario usuario, Libro libro, LocalDate diaReserva) {
        String message = contruirMensaje(usuario, libro, diaReserva);
        log.info("Se ha enviado el mensaje correctamente: " + message);
    }
}
