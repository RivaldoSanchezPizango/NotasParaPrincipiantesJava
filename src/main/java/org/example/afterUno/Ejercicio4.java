package org.example.afterUno;

/*
    VERIFICAR SI UN NUMERO ES PAR O IMPAR
    EN ESTE EJERCICIO, DEBERAS DESARROLLAR UN PROGRAMA QUE VERIIQUE SI UN NUMERO
    INGRESADO POR EL USUARIO ES PAR O IMPAR
    esPar = numero % 2 == 0
    esImpar = numero % 2 != 0
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero;

        System.out.println("Escriba un numero");

        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();


        if (numero % 2 == 0) {
            System.out.println("es par");
        } else{
            System.out.println("es impar");
        }

        //String mensaje = numero % 2 == 0 ? "es par" :"es impar";
        //System.out.println("El numero es" + mensaje);

    }
}
