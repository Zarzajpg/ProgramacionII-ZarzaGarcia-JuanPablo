package Clase5;

public class CuentaBancaria {
    private String titular;
    private int numeroCuenta;
    private double saldo;
    
    public CuentaBancaria(String titular, int numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    //getters y setters
    public String getTitular() {
        return titular;
    }   
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El titular no puede ser nulo o vacío.");
        }
        this.titular = titular;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        if (numeroCuenta < 0) {
            throw new IllegalArgumentException("El número de cuenta debe ser positivo.");
        }
        this.numeroCuenta = numeroCuenta;
    }
    public double depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El depósito y el retiro deben ser positivos.");
        }
        this.saldo += monto;
        return saldo;
    }
    public double extraer(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El depósito y el retiro deben ser positivos.");
        }
        if (monto > saldo) {
            throw new IllegalArgumentException("Fondos insuficientes para realizar la extracción.");
        }
        this.saldo -= monto;
        return saldo;
    }
}
