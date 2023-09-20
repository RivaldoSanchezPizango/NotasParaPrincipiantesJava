package org.example.iteraciones;

import java.util.ArrayList;
import java.util.List;

public class Ciclos {
    public static void main(String[] args) {
        // WHILE
        // La instruccion while ejecuta continuamente un bloque de declaraciones mientras
        // una condicion particular es verdadera.
        // su sintaxis se puede expresar como:

        int numero = 2;
        int limite = 0;

        //while (limite < numero) {
        //    limite++;
        //    System.out.println("hola");
        //}

        // DO - WHILE
        // la instruccion do-while ejecuta un bloque de declaraciones al menos una vez
        // la diferencia entre while y do-while es que do-while
        // su sintaxis se puede expresar como:
        do {
            System.out.println("hola");
            limite++;
        } while (limite < numero );


        // FOR
        // proporciona una forma compacta de iterar sobre un rango de valores. tabien conocido
        // como "ciclo for" debido a la forma en que se repite repetidamente hasta que se satisface
        // una condicion particular. la forma general de la instruccion for se puede
        // expresar de la siguiente manera:

        int[] numeros = new int[4];
        numeros[0] = 12;
        numeros[1] = 234;
        numeros[2] = 623;
        numeros[3] = 552;

        for (int i= 0; i < numeros.length; i++) {
            System.out.println("contamos " + numeros[i]);
        }

        // for Each()

        List <String> nombres = new ArrayList<>();
        nombres.add("genrri");
        nombres.add("ilsen");
        nombres.add("llud");
        nombres.add("melvin");

        nombres.forEach(nombre -> {
            System.out.println("el nombre es: " + nombre);
        });
    }
}
