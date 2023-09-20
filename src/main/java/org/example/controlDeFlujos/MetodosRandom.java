package org.example.controlDeFlujos;

public class MetodosRandom {
    public static void main(String[] args) {
        double random = 0.0;
        random = Math.random();
        System.out.println("Numero aleatorio" + random);
        random = Math.random();
        System.out.println("Numero aleatorio" + random);
        random = Math.random();
        System.out.println("Numero aleatorio" + random);

        // RANDOM CON RANGO
        int minino = 1, maximo = 50, rango = maximo + minino;
        int random2 = 0;

        random2 = (int) (Math.random() * rango) + minino;
        System.out.println(random2);

        random2 = (int) (Math.random() * rango) + minino;
        System.out.println(random2);

        random2 = (int) (Math.random() * rango) + minino;
        System.out.println(random2);
    }
}
