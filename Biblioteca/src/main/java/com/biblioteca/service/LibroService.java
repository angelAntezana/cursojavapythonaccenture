package com.biblioteca.service;

import java.util.List;

import com.biblioteca.domain.libro.Libro;

public class LibroService {

        
    public LibroService() {
    }

    public boolean available(Libro libro) {
        return libro.getStock() > 0;
    }

    public Libro getLibroByTitulo(List<Libro> libros, String tituloLibro) {
        return libros.stream()
                 .filter(libro -> libro.getTitulo().equalsIgnoreCase(tituloLibro))
                 .findFirst()
                 .orElse(null);
    }
    
}
