package com.ejercicios.animal;
import java.util.List;

public class AnimalApp {
   /*
   Recorrer la lista y mostrar todos los animales. (pista bluce)
Contar cuántos animales pesan más de 100 kg. (pista contador + bucle foreach + if a> 100 - contador ++)
Obtener el animal de mayor edad. (pusta masViejo es el primero luego blucle uno por uno comparamos y vamos sustituyen masViejo según sea mayor que el anterior)
Crear una nueva lista con los animales cuya edad sea menor que 6. (Pista crea un lista de jovenes, bucle y añade todos los < 6)
   */
    public static void main(String[] args) {
    List<Animal> animales = List.of(
    new Animal("Tigre", 5, 220),
    new Animal("Leon", 8, 190),
    new Animal("Lince", 3, 25),
    new Animal("Oso", 12, 350),
    new Animal("Lobo", 6, 45)
);

    Animal.imprimirAnimales(animales);
    long animalesPesoMayorCienKilos = Animal.animalesConPesoMayorACienKilos(animales);
    IO.println("""
            Animales con peso superior a 100kg:
            """ + animalesPesoMayorCienKilos);

    IO.println(Animal.obtenerAnimalMasMayor(animales));
    IO.println(Animal.obtenerAnimalesMenoresASeisAños(animales));
    Animal.ordenarPorNombre(animales);
    IO.println("PESO MEDIO DE ANIMALES: " + Animal.calcularPesoMedio(animales));
    }

}
