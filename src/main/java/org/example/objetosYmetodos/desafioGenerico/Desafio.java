package org.example.objetosYmetodos.desafioGenerico;

public class Desafio {
    static int numero = 10;
    public static void main(String[] args) {

        System.out.println(numero);

        incrementar();

        System.out.println(numero);
    }

    static public void incrementar () {
        numero++;
    }
}
