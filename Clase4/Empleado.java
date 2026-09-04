class Empleado {
    private String nombre;
    private int legajo;

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }
    public int getLegajo() {
        return legajo;
    }
    public String getNombre() {
        return nombre;
    }
    public double calcularSueldo() {
        return 0.0; // Método a implementar en subclases
    }
}
