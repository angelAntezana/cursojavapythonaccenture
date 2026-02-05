package com.biblioteca.service;

import java.time.LocalDate;
import java.util.List;

import com.biblioteca.domain.libro.Libro;
import com.biblioteca.domain.reserva.Reserva;
import com.biblioteca.util.LoggerUtil;

public class ReservaService {

    private LoggerUtil log = new LoggerUtil();
    private LibroService libroService = new LibroService();

    public Reserva reservar(List<Libro> libros, String tituloLibro) {
        Libro libro = libroService.getLibroByTitulo(libros, tituloLibro);
        
        if (libro == null) {
            log.info("\nNo se ha encontrado el nombre del libro: " + tituloLibro);
            return null;
        }

        if(!libroService.available(libro)) {
            log.info("El libro " + libro.getTitulo() + " no se encuentra disponible");
            return null;
        }
        Reserva reserva = new Reserva(1L, LocalDate.now(), LocalDate.now().plusDays(7), false);

        log.info("Se ha hecho la reserva para el libro " + libro.getTitulo() + " con autor " + libro.getAutor());
        libros.remove(libro);
        libro.setStock(libro.getStock() - 1);
        libros.add(libro);
        return reserva;
    }

}
