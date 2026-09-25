package Clase6;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, double precio, int cantidadPuertas) {
        super(marca, modelo, precio);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + cantidadPuertas + " puertas";
    }
    
}
