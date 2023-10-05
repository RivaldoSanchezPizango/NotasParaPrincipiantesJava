package org.example.excepciones;

public class Excepciones {
    public static void main(String[] args) {

        try {
            int resultado = 3 / 0;
        } catch (Exception e) {
            System.out.println("No se puede dividir por 0!!!");
        };

        try {
            int numeros [] = {12,45,56,7};
            System.out.println("La posicion de la edad es: " + numeros[4]);
        } catch (Exception e) {
            System.out.println("Intentaste entrar a un indice que no existe");
        }

    }
}
