package com.sinensia.biblioteca.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sinensia.biblioteca.application.port.in.CreateLibroUseCase;
import com.sinensia.biblioteca.application.port.in.GetLibroUseCase;
import com.sinensia.biblioteca.application.port.out.LibroRepositoryPort;
import com.sinensia.biblioteca.domain.model.Libro;
import com.sinensia.biblioteca.infrastructure.controller.dto.LibroDto;
import com.sinensia.biblioteca.infrastructure.controller.dto.LibroRequest;
import com.sinensia.biblioteca.infrastructure.controller.dto.LibroResponse;

@Service
public class LibroService implements CreateLibroUseCase, GetLibroUseCase{

    private final LibroRepositoryPort libroRepositoryPort;

    public LibroService(LibroRepositoryPort libroRepositoryPort) {
        this.libroRepositoryPort = libroRepositoryPort;
    }
    @Override
    public LibroResponse createLibro(LibroRequest libro) {
        Libro libroModel = new Libro(null, libro.nombre());
        Libro newLibro =  libroRepositoryPort.save(libroModel);
        return new LibroResponse(newLibro.idLibro());
    }
    @Override
    public List<LibroDto> getAll() {
        return libroRepositoryPort.getAll().stream()
        .map((Libro libro) -> {
            return new LibroDto(libro.idLibro(), libro.nombre());
        })
        .toList();
    }
    
}
