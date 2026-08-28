import java.util.Scanner;

public class VectorNumeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] vector = new int[15];

        // LLENAR EL VECTOR CON NUMEROS ENTRE 10 Y 100
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

        // MOSTRAR EL VECTOR EN LA CONSOLA
        System.out.println("\nValores del vector:");

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        // BUSCAR UN NUMERO EN EL VECTOR 
        System.out.print("\n\nIngrese un numero para buscar: ");
        int buscar = teclado.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                System.out.println("El numero se encuentra en la posicion " + i);
                encontrado = true;
            }
        }
            //ESTOS SON LOS NUMEROS DE LA PRUEBA 11 20 35 50 12 78 90 45 60 25 100 15 40 55 30  
        if (!encontrado) {
            System.out.println("El numero no esta en el vector.");
        }

        // DETERMINAR EL NUMERO MAYOR Y EL MENOR DENTRO DEL VECTOR
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

        // MULTIPLOS DE X SE INGRESA CUALQUIER NUMERO DEL VECTOR
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

        // CALCULAR LA SUMA DE TODOS LOS ELEMENTOS DEL VECTOR
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }

        System.out.println("\n\nSuma total: " + suma);

        // CALCULAR EL PROMEDIO
        double promedio = (double) suma / vector.length;

        System.out.println("Promedio: " + promedio);

        // NUEVO VECTOR CON VALORES MAYORES AL PROMEDIO
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