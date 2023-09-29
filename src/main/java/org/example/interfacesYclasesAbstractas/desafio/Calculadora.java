package org.example.interfacesYclasesAbstractas.desafio;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Suma con Enteros");
        System.out.println(Suma.sumar(12, 23));

        System.out.println("Suma con Float");
        System.out.println(Suma.sumar(2.3f,4.5f));

        System.out.println("Suma con Long");
        System.out.println( Suma.sumar(34323423l, 3342434l));

        System.out.println("Suma con Double");
        System.out.println(Suma.sumar(123.3,233.3));


    }
}
