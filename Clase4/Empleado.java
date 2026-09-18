package Clase5;

public class Empleado {
	private String nombre;
	private int legajo;

	public Empleado(String nombre, int legajo) {
		this.nombre = nombre;
		this.legajo = legajo;
	}

	public double calcularSueldo() {
		return 0;
	}

    public String getNombre() {
        return nombre;
    }
	public int getLegajo() {
		return legajo;
	}

	public static void mostrarLegajosExtremos() {
		Empleado[] empleados = {
			new Empleado("Ana", 104),
			new Empleado("Bruno", 101),
			new Empleado("Carla", 108),
			new Empleado("Diego", 103)
		};

		int menor = empleados[0].getLegajo();
		int mayor = empleados[0].getLegajo();

		for (Empleado empleado : empleados) {
			menor = Math.min(menor, empleado.getLegajo());
			mayor = Math.max(mayor, empleado.getLegajo());
		}

		System.out.println("Legajo más bajo: " + menor + " Pertenece a: " + empleados[0].getNombre());
		System.out.println("Legajo más alto: " + mayor + " Pertenece a: " + empleados[1].getNombre());
	}

	public static void main(String[] args) {
		mostrarLegajosExtremos();
	}
}
