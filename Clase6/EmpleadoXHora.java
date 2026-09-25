package Clase6;

public class EmpleadoXHora extends Empleado {
    private double sueldoPorHora;
    private double horasTrabajadas;

    public EmpleadoXHora(String nombre, int legajo, double sueldoPorHora, double horasTrabajadas) {
        super(nombre, legajo);
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return sueldoPorHora * horasTrabajadas;
    }
}
