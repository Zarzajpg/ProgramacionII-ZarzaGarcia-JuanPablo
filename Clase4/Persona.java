class Persona {
    private String nombre;
    private int dni;
    private int edad;

    public Persona(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', dni=" + dni + ", edad=" + edad + "}";
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 12345678, 25);
        Persona persona2 = new Persona("Luis", 23456789, 30);
        Persona persona3 = new Persona("Marta", 34567890, 22);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }
}
