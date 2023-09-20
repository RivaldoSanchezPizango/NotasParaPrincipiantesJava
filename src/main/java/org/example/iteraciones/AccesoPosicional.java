package org.example.iteraciones;

import java.util.ArrayList;
import java.util.List;

public class AccesoPosicional {
    public static void main(String[] args) {
        List <String> champions = new ArrayList<>();
        champions.add("Barcelona");
        champions.add("Chelsea");
        champions.add("Milan");

        for (String grupoA: champions) {
            System.out.println("el grupo A es: " + grupoA);
        }

        // LAS OPERACIONES BASICAS DE ACCESO POSICIONAL SON GET - SET - ADD - REMOVE

        // GET - obtiene el elemento de la posicion inidicada
        System.out.println("El equipo favorito es: " + champions.get(1));

        // SET - reemplaza el elemento en la posicion indicada
        champions.set(0, "Real Madrid");
        for (String item : champions) {
            System.out.println("equipos: " + item);
        }
    }
}
