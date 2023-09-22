package org.example.herenciaYexcepciones.herencia;

public class Prueba {
    public static void main(String[] args) {
        Perro firulais = new Perro();
        firulais.setEdad(3);

        Gato mishi = new Gato();
        mishi.setEdad(4);
        mishi.lavarse();


        // ESTO ES POLIMORFISMO   (UN OBJETO PUEDE TOMAR DIFERENTES FORMAS)
        // LA VARIABLE PUEDE SER TANTO COMO PERRO Y COMO GATO
        Animal pantera = new Gato();

    }
}
