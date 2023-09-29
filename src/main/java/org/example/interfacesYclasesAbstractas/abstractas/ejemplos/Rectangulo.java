package org.example.interfacesYclasesAbstractas.abstractas.ejemplos;

public class Rectangulo extends  Graficos{

    @Override
    void dibujar() {
        System.out.println("Dibujando Rectangulo");
    }

    @Override
    void cambiarTamanio() {
        System.out.println("cambiando tamanio");
    }

    @Override
    void moverA(int x, int y) {
        if (x < 5) {
            System.out.println("El rectangulo no se puede mover");
        } else {
            super.moverA(x,y);
        }
    }
}
