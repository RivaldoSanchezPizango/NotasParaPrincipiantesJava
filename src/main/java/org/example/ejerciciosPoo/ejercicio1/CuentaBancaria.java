package org.example.ejerciciosPoo.ejercicio1;

public class CuentaBancaria {
    private String numeroCuenta;
    private  double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public CuentaBancaria setSaldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public CuentaBancaria setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        return this;
    }

    public void depositar (double monto) {
        this.saldo += monto;
    }

    public void  extraer (double monto) {
        this.saldo -= monto;
    }
}
