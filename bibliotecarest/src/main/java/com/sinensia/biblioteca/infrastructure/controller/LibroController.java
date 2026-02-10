package com.sinensia.biblioteca.infrastructure.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.biblioteca.application.port.in.CreateLibroUseCase;
import com.sinensia.biblioteca.application.port.in.GetLibroUseCase;
import com.sinensia.biblioteca.infrastructure.controller.dto.LibroDto;
import com.sinensia.biblioteca.infrastructure.controller.dto.LibroRequest;
import com.sinensia.biblioteca.infrastructure.controller.dto.LibroResponse;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/libros")
public class LibroController {

    private final CreateLibroUseCase createLibroUseCase;
    private final GetLibroUseCase getLibroUseCase;
    
    public LibroController(CreateLibroUseCase createLibroUseCase,
        GetLibroUseCase getLibroUseCase
    ) {
        this.createLibroUseCase = createLibroUseCase;
        this.getLibroUseCase = getLibroUseCase;
    }

    @PostMapping("/")
    public ResponseEntity<LibroResponse> createLibro(@RequestBody LibroRequest libro) {

        return ResponseEntity.ok(createLibroUseCase.createLibro(libro));
    }
    @GetMapping("/")
    public ResponseEntity<List<LibroDto>> getAllLibros() {
        return ResponseEntity.ok(getLibroUseCase.getAll());
    }
    
    
}
