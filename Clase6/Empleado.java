package Clase6;

public class Empleado {
	protected String nombre;
	protected int legajo;

	public Empleado(String nombre, int legajo) {
		this.nombre = nombre;
		this.legajo = legajo;
	}

	public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public double calcularSueldo() {
        return 0;
    }

	@Override
	public String toString() {
		return nombre + " (legajo " + legajo + ") - $" + calcularSueldo();
	}
}