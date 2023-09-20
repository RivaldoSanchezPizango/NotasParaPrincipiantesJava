package org.example.iteraciones;

import java.util.ArrayList;
import java.util.List;

public class DesafioListas {
    public static void main(String[] args) {
        List <Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.random() * 10) + 1);
        }
        for (int numero : numeros) {
            if (numero % 3 == 0) {
                break;
            }
        }

    }
}
