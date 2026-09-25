package Clase6;
public class EmpleadoSupCl {
    public class EmpleadoAsalariado extends Empleado {
    private double sueldoBasico;
    private double bono;

    public EmpleadoAsalariado(String nombre, int legajo, double sueldoBasico, double bono) {
        super(nombre, legajo);
        this.sueldoBasico = sueldoBasico;
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBasico + bono;
    }
}
}
