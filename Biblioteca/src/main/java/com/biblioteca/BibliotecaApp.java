package com.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class BibliotecaApp {
    void main() {
        Libro libro0 = new Libro("Loquesea", "test", 100, "Charles", 2);
        Libro libro1 = new Libro("Otro", "test", 100, "Anderson", 2);
        
        List<Libro> libros = new ArrayList<>();
        libros.add(libro0);
        libros.add(libro1);

        Reserva reserva = new Reserva();

        String input;
        IO.println("--- RESERVA DE LIBROS ---");

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                IO.println("\nPara salir escribe n. Introduce el nombre del libro para ver si está disponible:");
                input = scanner.next();
                if (input.equals("n")) {
                    continue;
                }
                
                reserva.reservar(libros, input);

            } while (!input.equalsIgnoreCase("n"));

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error en el sistema.");
        }
        IO.println("--- HAS SALIDO DE LA RESERVA DE LIBROS ---");
    }
}
