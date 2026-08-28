import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        // Crear el objeto para leer datos del usuario
        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.println("Ingrese el numero a determinar: ");
        N = scanner.nextInt();

        // Lógica equivalente a tu pseudocódigo
        if (N < 0) {
            System.out.println("Error");
        } else if (N == 1 || N == 2 || N == 0) {
            System.out.println("Caso limite");
        } else if (N % 2 == 0) {
            System.out.println("No es primo");
        } else {
            System.out.println("Es primo");
        }

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}