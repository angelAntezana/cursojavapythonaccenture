package com.biblioteca.service;

import java.util.ArrayList;
import java.util.List;

import com.biblioteca.domain.libro.Libro;
import com.biblioteca.util.LoggerUtil;

public class Reserva {

    private LoggerUtil log = new LoggerUtil();
    
    private boolean available(Libro libro) {
        return libro.getStock() > 0;
    }

    private Libro getLibroByTitulo(List<Libro> libros, String tituloLibro) {
        return libros.stream()
                 .filter(libro -> libro.getTitulo().equalsIgnoreCase(tituloLibro))
                 .findFirst()
                 .orElse(null);
    }

    public void reservar(List<Libro> libros, String tituloLibro) {
        Libro libro = getLibroByTitulo(libros, tituloLibro);
        
        if (libro == null) {
            log.info("\nNo se ha encontrado el nombre del libro: " + tituloLibro);
            return;
        }

        if(!available(libro)) {
            log.info("El libro " + libro.getTitulo() + " no se encuentra disponible");
            return;
        }

        log.info("Se ha hecho la reserva para el libro " + libro.getTitulo() + " con autor " + libro.getAutor());
        libros.remove(libro);
        libro.setStock(libro.getStock() - 1);
        libros.add(libro);
    }

}
