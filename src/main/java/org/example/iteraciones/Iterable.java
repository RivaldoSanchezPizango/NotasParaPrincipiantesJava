package org.example.iteraciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {
        // ITERATOR
        // es un objeto que se usa para recorrer una coleccion. El objeto iterator devuelve
        // la operacion iterator de List y los elementos de la lista en la secuencia adecuada.
        List <String> animales = new ArrayList<>();
        animales.add("Leon");
        animales.add("Cebra");
        animales.add("Hipopotamo");
        animales.add("cocodrilos");

       Iterator<String> iterador = animales.iterator();

        // METODOS
        // hasNext() - es usado para chequear si queda al menos un elemento sobre cual iterar
        while (iterador.hasNext()) {
            String animal = iterador.next();
            System.out.println("animal: " + animal);
        }
        // next() - es usado para pararse en el proximo elemento y obtenerlo. es una buena practica
        // de programacion usar hasNext() antes de usar next().


        // remove () - es usado para remover el elemento actual de la collecion

    }
}
