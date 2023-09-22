package org.example.herenciaYexcepciones.herencia;

public class Equals {
    public static void main(String[] args) {
        Perro tobby = new Perro();
        Perro tarzan = new Perro();

        // HASHCODE()
        // ES UN IDENTIFICADOR QUE SE ASIGNA A CADA OBJETO QUE SE CREA Y SE ALMACENA
        // EN UN (HASH) EN LA INSTANCIA DE LA CLASE -- (TODAS LAS CLASES HEREDAN EL COMPORTAMIENTO)
        System.out.println(tobby.hashCode());
        System.out.println(tarzan.hashCode());

        // EQUALS
        // SE USA PARA ANALIZAR LA IGUALDAD ENTRE 2 OBJETOS
        // IGUALDAD REFERENCIAL -- 2 VARIABLES DISTINTAS QUE HACEN REFERENCIA AL ,MISMO OBJETO
        // IGUALDAD DE OBJETOS -- 2 VARIABLES DISTINTAS QUE HACEN REFERENCIA A 2 OBJETOS DISTINTOS
        // PERO DESDE EL PUNTO DE VISTA DE LA LOGICA SON CONSIDERADOS IGUALES
        System.out.println(tobby.equals(tarzan));
    }
}
