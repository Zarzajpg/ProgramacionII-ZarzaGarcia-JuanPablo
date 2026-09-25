package Clase6;

public class PruebaEmpleado {
    public static void main(String[] args) {
        // Instanciación de un objeto de cada subclase
        EmpleadoXHora empHoras = new EmpleadoXHora("Carlos López", 32156, 160, 12.50);
        EmpleadoAsal empAsalariado = new EmpleadoAsal("Ana Martínez", 54483, 2500.00, 350.00);

        // Muestra del sueldo calculado para cada uno
        System.out.println("Empleado: " + empHoras.getNombre());
        System.out.println("Sueldo calculado: $" + empHoras.calcularSueldo());

        System.out.println("\nEmpleado: " + empAsalariado.getNombre());
        System.out.println("Sueldo calculado: $" + empAsalariado.calcularSueldo());
    }
}
