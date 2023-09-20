package org.example.controlDeFlujos;

public class OperadorTernario {
    public static void main(String[] args) {
        int edad = 17;
        boolean puedeEntrar = edad < 18 ? false : true;

        String mensaje = puedeEntrar ? "puede entrar" : "no puede acceder";
        System.out.println(mensaje);
    }
}
