package com.ejercicios.animal;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Animal {
    private final String nombre;
    private final int edad;
    private final double pesoKg;

    public Animal(String nombre, int edad, double pesoKg) {
        this.nombre = nombre;
        this.edad = edad;
        this.pesoKg = pesoKg;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getPesoKg() { return pesoKg; }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años, " + pesoKg + " kg)";
    }

    public static void imprimirAnimales(List<Animal> animales) {
        animales.forEach(System.out::println);
    }

    public static long animalesConPesoMayorACienKilos(List<Animal> animales) {
        return animales.stream().filter(animal -> animal.getPesoKg()>100)
        .count();
    }
    public static Optional<Animal> obtenerAnimalMasMayor(List<Animal> animales) {
        return animales.stream().max((a1, a2) -> a1.getEdad()- a2.getEdad());
    }

    public static List<Animal> obtenerAnimalesMenoresASeisAños(List<Animal> animales) {
        return animales.stream()
            .filter(animal -> animal.getEdad() > 6)
            .toList();
    }

    public static void ordenarPorNombre(List<Animal> animales) {
        animales.stream().sorted(Comparator.comparing(Animal::getNombre)).forEach(IO::println);
    }

    public static double calcularPesoMedio(List<Animal> animales) {
        return animales.stream().mapToDouble(Animal::getPesoKg)
        .average()
        .getAsDouble();
    }

    public static void existeAnimalConPesoMayorA300Kilos(List<Animal> animales) {
        boolean existe = animales.stream().anyMatch(animal -> animal.getPesoKg() > 300);
        IO.println(existe ? "Existe un animal con más de 300 kg" : "No existe animal con 300kg");
    }
}
