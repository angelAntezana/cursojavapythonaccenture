package com.biblioteca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.biblioteca.domain.libro.Libro;
import com.biblioteca.domain.material.MaterialBiblioteca;
import com.biblioteca.domain.material.MaterialDigital;
import com.biblioteca.domain.material.MaterialFisico;
import com.biblioteca.domain.material.TipoMaterialDigital;
import com.biblioteca.domain.material.TipoMaterialFisico;
import com.biblioteca.domain.obra.TipoObra;
import com.biblioteca.domain.reserva.Reserva;
import com.biblioteca.domain.usuario.Usuario;
import com.biblioteca.service.EmailService;
import com.biblioteca.service.LibroService;
import com.biblioteca.service.ReservaService;
import com.biblioteca.util.LoggerUtil;

/**
 * Hello world!
 */
public class BibliotecaApp {
    void main() {
        // DATA
        Usuario usuario = new Usuario("Eloy", "Cabrera", "eloy@email.com", null);
        LoggerUtil log = LoggerUtil.getInstance();
        Libro libro0 = new Libro("Enciclopedia 2026", "test", 100, "Charles", 2, TipoObra.NOVELA);
        Libro libro1 = new Libro("Libro", "test", 100, "Anderson", 2, TipoObra.NOVELA);
        
        List<MaterialBiblioteca> materialesLibro0 = new ArrayList<>();
        materialesLibro0.add(new MaterialDigital(71L, TipoMaterialDigital.AUDIO));
        materialesLibro0.add(new MaterialDigital(2L, TipoMaterialDigital.DOCUMENTO));
        materialesLibro0.add(new MaterialFisico(3L, TipoMaterialFisico.LIBRO));
        materialesLibro0.sort((l1, l2) -> (l1.getIdentificador().intValue() - l2.getIdentificador().intValue()));
        materialesLibro0
        .sort(Comparable::compareTo);
        log.info(materialesLibro0);

        List<MaterialBiblioteca> materialesLibro1 = new ArrayList<>();

        libro0.setListMaterialBibliotecas(materialesLibro0);
        libro1.setListMaterialBibliotecas(materialesLibro1);

        List<Libro> libros = new ArrayList<>();
        libros.add(libro0);
        libros.add(libro1);
        libros.sort(Comparator.comparing(Libro::getAutor).thenComparing(Libro::getTitulo));
        String input;

        // SERVICE
        ReservaService reservaService = new ReservaService();
        EmailService emailService = new EmailService();
        LibroService libroService = new LibroService();

        log.info("--- RESERVA DE LIBROS ---");

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                log.info("\nPara salir escribe n. Introduce el nombre del libro para ver si está disponible:");
                input = scanner.nextLine();
                if (input.equals("n")) {
                    continue;
                }
                
                Reserva reserva = reservaService.reservar(libros, input);
                if (reserva != null) {
                    var libro = libroService.getLibroByTitulo(libros, input);
                    emailService.enviarEmail(usuario, libro, reserva.getFechaInicio());
                }

            } while (!input.equalsIgnoreCase("n"));

        } catch (Exception e) {
            log.error("Ha ocurrido un error en el sistema.");
        }
        log.info("--- HAS SALIDO DE LA RESERVA DE LIBROS ---");
    }
}
