package com.sinensia.biblioteca.application.port.out;

import java.util.List;

import com.sinensia.biblioteca.domain.model.Libro;

public interface LibroRepositoryPort {
    Libro save(Libro libro);

    List<Libro> getAll();
}
