package org.example.afterUno;

/*
    EN ESTE EJERCICIO DEBEREAS DESARROLLAR UN PROGRAMA QUE SUME 2 NUMEROS Y MUESTRE EL RESULTADO POR PANTALLA
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 10) +1;
        int numero2 = (int) (Math.random() * 10) + 1;

        System.out.println("ingrese el numero que quiera sumar: ");

        Scanner teclado = new Scanner(System.in);
         numero = teclado.nextInt() ;
        numero2 = teclado.nextInt();

        System.out.println("resultado suma es: " + (numero + numero2));
    }
}
