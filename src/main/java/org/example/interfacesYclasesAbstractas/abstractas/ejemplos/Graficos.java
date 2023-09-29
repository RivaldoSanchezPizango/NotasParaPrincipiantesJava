package org.example.interfacesYclasesAbstractas.abstractas.ejemplos;

/*
    UNA CLASE ABSTRACTA BASICAMENTE NOS SIRVE PARA IR DEFINIENDO CIERTOS METODOS QUE VAN A COMPARTIR TODOS
    SUS HIJOS, PERO QUE LA FUNCIONALIDAD VA A SER DIFERENTE.
 */
public abstract class Graficos {
    int x, y;

    void moverA (int x, int y) {
        System.out.println("Moviendo a: " + x + ", " + y);
    }

    abstract void dibujar();
    abstract void cambiarTamanio();
}
