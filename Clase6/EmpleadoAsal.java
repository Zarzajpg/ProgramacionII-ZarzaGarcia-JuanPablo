package Clase6;

    public class EmpleadoAsal extends Empleado {
    private double sueldoBasico;
    private double bono;

    public EmpleadoAsal(String nombre, int legajo, double sueldoBasico, double bono) {
        super(nombre, legajo);
        this.sueldoBasico = sueldoBasico;
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBasico + bono;
    }
}
