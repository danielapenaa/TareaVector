import java.util.Scanner;

public class VectorNumeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] vector = new int[15];

        // Llenar el vector
        for (int i = 0; i < vector.length; i++) {

            int numero;

            do {
                System.out.print("Ingrese el numero " + (i + 1) + " entre 10 y 100: ");
                numero = teclado.nextInt();

                if (numero < 10 || numero > 100) {
                    System.out.println("El numero esta fuera del rango.");
                }

            } while (numero < 10 || numero > 100);

            vector[i] = numero;
        }

        // Mostrar el vector en la consola
        System.out.println("\nValores del vector:");

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        // Buscar un numero en el vector
        System.out.print("\n\nIngrese un numero para buscar: ");
        int buscar = teclado.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                System.out.println("El numero se encuentra en la posicion " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El numero no esta en el vector.");
        }

        // Determinar el mayor numero y el menor dentro del vector
        int mayor = vector[0];
        int menor = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }

            if (vector[i] < menor) {
                menor = vector[i];
            }
        }

        System.out.println("\nNumero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);

        // Multiples de X
        System.out.print("\nIngrese un numero X para buscar sus multiplos: ");
        int x = teclado.nextInt();

        boolean hayMultiplos = false;

        System.out.println("Multiplos de " + x + ":");

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % x == 0) {
                System.out.print(vector[i] + " ");
                hayMultiplos = true;
            }
        }

        if (!hayMultiplos) {
            System.out.println("No hay multiplos de " + x + " en el vector.");
        }

        // Calcular la suma de todos los elementos del vector
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }

        System.out.println("\n\nSuma total: " + suma);

        // Promedio 
        double promedio = (double) suma / vector.length;

        System.out.println("Promedio: " + promedio);

        // Nuevo vector con valores mayores al promedio
        int cantidad = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > promedio) {
                cantidad++;
            }
        }

        if (cantidad == 0) {
            System.out.println("No hay numeros mayores que el promedio.");
        } else {

            int[] vectorMayorPromedio = new int[cantidad];
            int posicion = 0;

            for (int i = 0; i < vector.length; i++) {
                if (vector[i] > promedio) {
                    vectorMayorPromedio[posicion] = vector[i];
                    posicion++;
                }
            }

            System.out.println("Numeros mayores que el promedio:");

            for (int i = 0; i < vectorMayorPromedio.length; i++) {
                System.out.print(vectorMayorPromedio[i] + " ");
            }

            System.out.println("\nCantidad de numeros por encima del promedio: " + cantidad);
        }

        teclado.close();
    }
}