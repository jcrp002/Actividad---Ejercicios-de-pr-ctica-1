import java.util.Scanner;

public class DiferenciaArreglos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Definición de los arreglos
        double[] arreglo1 = new double[7];
        double[] arreglo2 = new double[7];
        double[] arregloDiferencia = new double[7];

        double sumaTotal = 0;

        // Ingreso de datos para el primer arreglo
        System.out.println("Ingrese 7 números para el primer arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextDouble();
            sumaTotal += arreglo1[i];
        }

        // Ingreso de datos para el segundo arreglo
        System.out.println("\nIngrese 7 números para el segundo arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo2[i] = scanner.nextDouble();
            sumaTotal += arreglo2[i];
        }

        // Calcular la diferencia entre arreglos
        for (int i = 0; i < 7; i++) {
            arregloDiferencia[i] = arreglo1[i] - arreglo2[i];
            sumaTotal += arregloDiferencia[i];
        }

        // Calcular promedio de todos los datos
        int totalElementos = arreglo1.length + arreglo2.length + arregloDiferencia.length;
        double promedio = sumaTotal / totalElementos;

        // Mostrar el tercer arreglo
        System.out.println("\nElementos del tercer arreglo (diferencias):");
        for (int i = 0; i < 7; i++) {
            System.out.println("Posición " + i + ": " + arregloDiferencia[i]);
        }

        // Mostrar el promedio
        System.out.println("\nPromedio de todos los datos: " + promedio);

        scanner.close();
    }
}