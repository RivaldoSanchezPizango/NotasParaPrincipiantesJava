package org.example.iteraciones;

public class Array {
    public static void main(String[] args) {

        // ESTA FORMA DE DECLARAR ARREGLOS SE USAN USUALMENTE CUANDO YA SABEMOS
        // CUANTOS DATOS VAN A TENER
        String[] nombres = new String[5];
        nombres[0] = "rivaldo";
        nombres[1] = "ilsen";
        nombres[2] = "llud";
        nombres[3] = "genri";
        nombres[4] = "melvin";

        for (int i = 0; i < nombres.length; i++ ) {
            System.out.println(nombres[i]);
        }

    }
}
