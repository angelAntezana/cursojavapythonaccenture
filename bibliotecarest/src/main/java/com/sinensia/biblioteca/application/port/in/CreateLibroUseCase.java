
package com.sinensia.biblioteca.application.port.in;

import com.sinensia.biblioteca.infrastructure.controller.dto.LibroRequest;
import com.sinensia.biblioteca.infrastructure.controller.dto.LibroResponse;

public interface CreateLibroUseCase {

    LibroResponse createLibro(LibroRequest libro);
    
}