package com.sinensia.biblioteca.infrastructure.adapter;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sinensia.biblioteca.application.port.out.LibroRepositoryPort;
import com.sinensia.biblioteca.domain.model.Libro;
import com.sinensia.biblioteca.infrastructure.persistence.entity.LibroEntity;
import com.sinensia.biblioteca.infrastructure.persistence.repository.LibroJpaRepository;

@Component
public class LibroRepositoryAdapter implements LibroRepositoryPort{

    private final LibroJpaRepository libroJpaRepository;

    public LibroRepositoryAdapter(LibroJpaRepository libroJpaRepository) {
        this.libroJpaRepository = libroJpaRepository;
    }

    @Override
    public Libro save(Libro libro) {
        LibroEntity newLibroEntity = LibroEntity.builder()
        .nombre(libro.nombre())
        .build();
        LibroEntity savedLibroEntity = libroJpaRepository.save(newLibroEntity);
        return new Libro(savedLibroEntity.getIdLibro(), savedLibroEntity.getNombre());

    }

    @Override
    public List<Libro> getAll() {
        List<LibroEntity> libroEntities = libroJpaRepository.findAll();
        return libroEntities.stream().map((LibroEntity libro) -> {
            return new Libro(libro.getIdLibro(), libro.getNombre());
        })
        .toList();
    }
    
}
