package org.example.afterUno;

/*
    CALCULADORA
    EN ESTE EJERCICIO DEBERAS DESARROLAR UNA CALCULADORA QUE REALIZE LAS CUATRO OPERACIONES
    BASICAS (SUMA, RESTA, MULTIPLICACION Y DIVISION) A PARTIR DE 2 NUMEROS Y LA OPERACION
    INGRESADA POR EL USUARIO
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero1 = teclado.nextInt();

        System.out.println("Ingrese otro numero");
        int numero2 = teclado.nextInt();

        System.out.println("ingrese una operacion matematica");
        String operacion = teclado.next();

        switch (operacion) {
            case "+":
                System.out.println(numero1 + numero2);
                break;
            case "-":
                System.out.println(numero1 - numero2);
                break;
            case "/":
                if(numero1 == 0 || numero2 == 0) {
                    System.out.println("no s epuede dividir con 0");
                }
                System.out.println(numero1 / numero2);
                break;
            case "*":
                System.out.println(numero1 * numero2);
                break;
            default:
                System.out.println("operacion invalida");
                break;
        }
    }
}
