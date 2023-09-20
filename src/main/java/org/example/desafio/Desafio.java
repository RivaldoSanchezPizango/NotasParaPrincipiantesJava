package org.example.desafio;

public class Desafio {
    public static void main(String[] args) {
        int capitalSolicitado = 1000;
        double intereses = 2;
        int cuotas = 12;

        int interesAPagar = capitalSolicitado * (int) intereses * cuotas;
        int montoTotal = capitalSolicitado + interesAPagar;

        System.out.println("el interes a pagar es de: " + montoTotal) ;
    }
}
