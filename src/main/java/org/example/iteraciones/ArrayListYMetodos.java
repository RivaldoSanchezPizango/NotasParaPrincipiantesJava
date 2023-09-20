package org.example.iteraciones;

import java.util.ArrayList;
import java.util.List;

public class ArrayListYMetodos {
    public static void main(String[] args) {
        // FUNCIONES ASOCIADAS A LAS LISTAS
        // containsAll devuelve verdadero si la collection de destino contiene todos
        // los elementos de la collection origen

        List <String> coloresOrigen = new ArrayList<>();
        coloresOrigen.add("negro");
        coloresOrigen.add("amarillo");
        coloresOrigen.add("verde");

        List <String> coloresDestino = new ArrayList<>();
        coloresDestino.add("azul");
        coloresDestino.add("naranja");
        coloresDestino.add("verde");

        // METODOS
        // containsAll
        // devuelve verdadero si la collection de destino contiene todos los elementos de la collection origen

        boolean contieneOriginal = coloresOrigen.containsAll(coloresDestino);
        System.out.println("contiene original + " + contieneOriginal);
        boolean contieneDestino = coloresDestino.containsAll(coloresOrigen);
        System.out.println(contieneDestino);

        // addAll
        // agrega todos los elementos de la collection origen en la collection destino
        //coloresOrigen.addAll(coloresDestino);
        //System.out.println("contieneDestino = " + contieneDestino);
        //for (String item: coloresOrigen) {
        //}

        // removeAll
        // remueve de la lista de destino todos los elementos de la lista origen
      //  coloresDestino.removeAll(coloresOrigen);
        //for (String color: coloresDestino) {
            //System.out.println("color: " + color);
        //}

        // retainAll
        //remueve de la lista destino todos los elementos que no estan en la lista origen
        //coloresDestino.retainAll(coloresOrigen);
        //for (String color: coloresDestino) {
          //  System.out.println("color: " + color);
        //}
        // clear
        // remueve todos los elementos de la collection
        coloresOrigen.clear();
        for (String color: coloresDestino) {
            System.out.println("color: " + color);
        }
    }
}
