package org.example.afterUno;

/*
    CONVERSION DE GRADOS CELSIUS A FAHRENHEIT
    EN ESTE EJERCICIO, TENDRAS QUE CREAR UN PROGRAMA QUE CONVIERTA UNA TEMPERATURA
    EN GRADOS CELSIUS A GRADOS FARENHEIT
    ** Farenheit ** = (9/5) \* c + 32
 */

public class Ejercicio3 {
    public static void main(String[] args) {

        double celsius = (Math.random() * 30) + 1;

        double fahrenheit = (9 / 5) * celsius + 32;

        System.out.println(celsius);
        System.out.println(fahrenheit);


    }
}
