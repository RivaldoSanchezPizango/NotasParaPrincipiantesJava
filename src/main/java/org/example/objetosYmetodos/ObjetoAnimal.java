package org.example.objetosYmetodos;

public class ObjetoAnimal {

    // ATRIBUTOS - CARACTERISTICAS
    int edad;
    String nombre;
    String raza;
    String color;

    // METODOS - ACCIONES
    // METODO SIMPLE
    public  void ladrar () {

        System.out.println("El perro esta ladrando");
    }

    // METODO - ESTATICO
    public  static void  sobreNombrePerrito () {
        System.out.println("Al perrito le dicen Firulais");
    }

    // METODO  ESTATICO CON PARAMETROS
    public  static void  textoAnimal (String texto) {
        System.out.println(texto);
    }
}
