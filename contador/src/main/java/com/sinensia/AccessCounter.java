package com.sinensia;

public class AccessCounter {

    // Contador global de accesos (variable de clase)
    private static int totalAccesses = 0;

    // Contador de accesos por instancia
    private int instanceAccesses = 0;

    private static void incrementTotalAccesses() {
        totalAccesses++;
    }

    public void registerAccess() {

        // Variable local al método
        String userId = "user-" + System.nanoTime();

        // Incremento de contadores
        incrementTotalAccesses();
        instanceAccesses++;

        // Bloque condicional con variable de bloque
        if (instanceAccesses > 1) {
            int threshold = 1; // variable de bloque
            System.out.println(
                    "Instancia ha superado el umbral de " + threshold +
                            " accesos. Usuario: " + userId);
        }
    }

    public static void main(String[] args) {

        AccessCounter serviceA = new AccessCounter();
        AccessCounter serviceB = new AccessCounter();

        serviceA.registerAccess();
        serviceA.registerAccess();

        serviceB.registerAccess();

        // Mostrar contadores finales
        System.out.println("Total accesos globales: " + totalAccesses);
        System.out.println("Accesos serviceA: " + serviceA.instanceAccesses);
        System.out.println("Accesos serviceB: " + serviceB.instanceAccesses);
    }
}