package org.example.interfacesYclasesAbstractas.abstractas.ejemplos;

public class Circulo extends Graficos {

    @Override
    void dibujar() {
        System.out.println("Dibujando Circulo");
    }

    @Override
    void cambiarTamanio() {
        System.out.println("cambiando tamanio");
    }
}
