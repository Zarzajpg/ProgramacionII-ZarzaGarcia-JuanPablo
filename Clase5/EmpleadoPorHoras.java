package Clase5;

public class EmpleadoPorHoras extends Empleado {
    // Atributos privados
    private double horasTrabajadas;
    private double valorHora;

    // Constructor que invoca a la clase base e inicializa atributos propios
    public EmpleadoPorHoras(String nombre, int legajo, double horasTrabajadas, double valorHora) {
        super(nombre, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    // Sobreescritura del cálculo de sueldo
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }

    // Prueba de polimorfismo
    public static void main(String[] args) {
        // Declarado como Empleado, instanciado como EmpleadoPorHoras
        Empleado emp = new EmpleadoPorHoras("María Gómez", 2045, 160.0, 15.5);

        // Imprime el objeto usando el polimorfismo y el método toString() heredado
        System.out.println(emp);
    }
}
