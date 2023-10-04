package org.example.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

        List <Persona> listaArray = new ArrayList<>();
        listaArray.add(new Persona(1, "Genrri", 37));
        listaArray.add(new Persona(2, "Ilsen", 33));
        listaArray.add(new Persona(3, "Llud", 30));
        listaArray.add(new Persona(4, "Melvin", 39));

        List <Persona> listaLinked = new LinkedList<>();
        listaLinked.add(new Persona(1, "Mauro", 23));
        listaLinked.add(new Persona(2, "Juan", 26));
        listaLinked.add(new Persona(3, "Gabriela", 19));
        listaLinked.add(new Persona(4, "Grecia", 22));

        // REMOVE EN ARRAYLIST
        listaArray.remove(1);

        // REMOVE EN LINKEDLIST
        String borrarNombre = "Juan";
        for (Persona persona2 : listaLinked) {
            if (persona2.getNombre().equals(borrarNombre)) {
                listaLinked.remove(persona2);
                break;
            }
        }
        System.out.println("---------Luego de eliminar --------");

        // RECORRIDO FOREACH
        System.out.println("ARRAYLIST");
        for (Persona persona:listaArray) {
            System.out.println("prueba: " + persona.getNombre());
        }

        System.out.println("LINKEDLIST");
        for (Persona persona:listaLinked) {
            System.out.println("prueba" + persona.getNombre());
        }
    }
}
