package org.example.iteraciones;

import java.util.ArrayList;
import java.util.List;

public class OperacionesDeBusqueda {
    public static void main(String[] args) {
        List <Integer> edades = new ArrayList<>();
        edades.add(22);
        edades.add(21);
        edades.add(26);
        edades.add(21);

        for (int edad : edades) {
            System.out.println("estas son todas las edades: " + edad);
        }

        // indexOf
        // devuelve la primera ocurrencia del elemento buscado. Si no lo encuentra devuelve -1;
        int edad = 31;
        int existeEdad = edades.indexOf(edad);
        System.out.println(existeEdad);

        // lastIndexOf
        // devuelve la ultima ocurrencia del elemento buscado.si no lo encuentra devuelve -1-
        int miEdad = 21;
        int posicion = edades.lastIndexOf(21);
        System.out.println(posicion);

    }
}
