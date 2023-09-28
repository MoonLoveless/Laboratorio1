public class Fibonacci {
    // Versión recursiva
    public static int fibRecurs(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibRecurs(n - 1) + fibRecurs(n - 2);
        }
    }

    // Versión iterativa
    public static int fibIter(int n) {
        if (n <= 1) {
            return n;
        }
        int[] F = new int[n + 1];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i <= n; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        return F[n];
    }

    public static void main(String[] args) {
        int[] numbersToGenerate = {3, 5, 7, 10};

        for (int n : numbersToGenerate) {
            System.out.println("Generando los primeros " + n + " números de Fibonacci:");

            // Versión recursiva
            long startTimeRecurs = System.nanoTime();
            System.out.print("Versión Recursiva: ");
            for (int i = 0; i < n; i++) {
                System.out.print(fibRecurs(i) + " ");
            }
            long endTimeRecurs = System.nanoTime();
            long durationRecurs = endTimeRecurs - startTimeRecurs; // Tiempo en nanosegundos
            System.out.println("\nTiempo Recursivo: " + durationRecurs + " ns");

            // Versión iterativa
            long startTimeIter = System.nanoTime();
            System.out.print("Versión Iterativa: ");
            for (int i = 0; i < n; i++) {
                System.out.print(fibIter(i) + " ");
            }
            long endTimeIter = System.nanoTime();
            long durationIter = endTimeIter - startTimeIter; // Tiempo en nanosegundos
            System.out.println("\nTiempo Iterativo: " + durationIter + " ns");

            System.out.println();
        }
    }
}
