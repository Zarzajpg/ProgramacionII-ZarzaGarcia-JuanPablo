package Clase5;

public class CuentaBancaria {
    private String titular;
    private int numeroCuenta;
    private double saldo;
    
    public CuentaBancaria(String titular, int numeroCuenta, double saldoInicial) {
        setTitular(titular);
        setNumeroCuenta(numeroCuenta);
        
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    // Segundo constructor: recibe solo titular y numeroCuenta
    // Delega en el constructor principal asignando un saldo inicial de 0
    public CuentaBancaria(String titular, int numeroCuenta) {
        this(titular, numeroCuenta, 0.0);
    }
    //getters 
    public String getTitular() {
        return titular;
    }   
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    //Setters con validaciones
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
    //Metodos para depositar y extraer dinero
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
