package org.example.afterUno;

/*
    CALCULO DEL AREA DE 1 TRIANGULOS
    EN ESTE EJERCICIO, DEBERAS DESARROLLAR UN PROGRAMA QUE CALCULE EL AREA DE UN TRIANGULO A
    PARTIR DE LA BASE Y LA ALTURA INGRESADAS POR EL USUARIO.
    ** Area ** = (base \* altura) / 2
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        double base = (int) (Math.random() * 20) + 1;
        double altura = (int) (Math.random() * 20) + 1;

        System.out.println(base);
        System.out.println(altura);

        double area = (base * altura) / 2;
        System.out.println("el resultado es: " + area);
    }
}
