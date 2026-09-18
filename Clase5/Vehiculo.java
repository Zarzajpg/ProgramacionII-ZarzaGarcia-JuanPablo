package Clase5;

public class Vehiculo {
    // Atributos privados de la clase
    private String marca;
    private String modelo;
    private double precio;

    // Constructor para inicializar los atributos del vehículo
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Retorna la marca del vehículo
    public String getMarca() {
        return marca;
    }

    // Retorna el modelo del vehículo
    public String getModelo() {
        return modelo;
    }

    // Retorna el precio del vehículo
    public double getPrecio() {
        return precio;
    }

    // Representación en texto del objeto vehículo
    @Override
    public String toString() {
        return marca + " " + modelo + " ($" + precio + ")";
    }
}
