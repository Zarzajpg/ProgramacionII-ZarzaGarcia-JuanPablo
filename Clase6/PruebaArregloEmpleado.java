package Clase6;

public class PruebaArregloEmpleado {
    public static void main(String[] args) {
        // Crear un arreglo de empleados
        Empleado[] empleados = new Empleado[4];

        // Instanciación de objetos de cada subclase
        empleados[0] = new EmpleadoXHora("Carlos López", 32156, 160, 12.50);
        empleados[1] = new EmpleadoAsal("Ana Martínez", 54483, 2500.00, 350.00);
        empleados[2] = new EmpleadoXHora("Luis Gómez", 78945, 150, 15.00);
        empleados[3] = new EmpleadoAsal("María Pérez", 98765, 3000.00, 500.00);

        // Mostrar el sueldo calculado para cada empleado
        for (Empleado emp : empleados) {
            System.out.println(emp.getNombre() + " (Legajo: " + emp.getLegajo() + ")");
            System.out.println("Sueldo a cobrar: $" + emp.calcularSueldo());
            System.out.println("----------------------------------------");
        }
    }
}
