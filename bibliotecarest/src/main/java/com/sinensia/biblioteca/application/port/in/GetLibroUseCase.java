package com.sinensia.biblioteca.application.port.in;

import java.util.List;

import com.sinensia.biblioteca.infrastructure.controller.dto.LibroDto;

public interface GetLibroUseCase {
    List<LibroDto> getAll();
}
