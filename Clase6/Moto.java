package Clase6;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + cilindrada + " cc";
    }
    
}
