package org.example.controlDeFlujos;

import javax.swing.*;

public class If {
    public static void main(String[] args) {
        int edad = 39;

        if (edad < 18) {
            System.out.println("Bienvenido jovencito");
        } else if (edad <= 40) {
            System.out.println("Bienvenido señor");
        } else {
            System.out.println("No cumples con los requisitos de edad");
        }
        // 1 - 4 reprobo
        // 5 - 6 aprobado (bien)
        // 7 - 8 aprobado (muy bien)
        // 8 - 10 aprobado (excelente)
        int nota = 6;

        if (nota > 1 && nota <= 4) {
            System.out.println("usted reprobo");
        } else if (nota > 5 && nota <= 6) {
            System.out.println("usted aprobo BIEN");
        } else if (nota > 7 && nota <= 8) {
            System.out.println("usted aprobo MUY BIEN");
        } else if (nota > 9 && nota <= 10) {
            System.out.println("usted aprobo EXCELENTE");
        }

    }
}