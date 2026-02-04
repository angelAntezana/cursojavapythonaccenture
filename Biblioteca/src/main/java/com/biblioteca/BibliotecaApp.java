package com.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biblioteca.domain.libro.Libro;
import com.biblioteca.domain.material.MaterialBiblioteca;
import com.biblioteca.domain.material.MaterialDigital;
import com.biblioteca.domain.material.MaterialFisico;
import com.biblioteca.domain.material.TipoMaterialDigital;
import com.biblioteca.domain.material.TipoMaterialFisico;
import com.biblioteca.domain.obra.TipoObra;
import com.biblioteca.service.Reserva;
import com.biblioteca.util.LoggerUtil;

/**
 * Hello world!
 */
public class BibliotecaApp {
    void main() {
        Libro libro0 = new Libro("Enciclopedia test", "test", 100, "Charles", 2, TipoObra.NOVELA);
        Libro libro1 = new Libro("Libro test", "test", 100, "Anderson", 2, TipoObra.NOVELA);
        
        List<MaterialBiblioteca> materialesLibro0 = new ArrayList<>();
        materialesLibro0.add(new MaterialDigital(1L, TipoMaterialDigital.AUDIO));
        materialesLibro0.add(new MaterialDigital(2L, TipoMaterialDigital.DOCUMENTO));
        materialesLibro0.add(new MaterialFisico(3L, TipoMaterialFisico.LIBRO));

        List<MaterialBiblioteca> materialesLibro1 = new ArrayList<>();

        libro0.setListMaterialBibliotecas(materialesLibro0);
        libro1.setListMaterialBibliotecas(materialesLibro1);

        List<Libro> libros = new ArrayList<>();
        libros.add(libro0);
        libros.add(libro1);

        Reserva reserva = new Reserva();
        LoggerUtil log = new LoggerUtil();
        String input;
        log.info("--- RESERVA DE LIBROS ---");

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                log.info("\nPara salir escribe n. Introduce el nombre del libro para ver si está disponible:");
                input = scanner.next();
                if (input.equals("n")) {
                    continue;
                }
                
                reserva.reservar(libros, input);

            } while (!input.equalsIgnoreCase("n"));

        } catch (Exception e) {
            log.error("Ha ocurrido un error en el sistema.");
        }
        log.info("--- HAS SALIDO DE LA RESERVA DE LIBROS ---");
    }
}
