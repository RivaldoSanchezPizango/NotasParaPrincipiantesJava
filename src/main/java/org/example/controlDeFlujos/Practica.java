package org.example.controlDeFlujos;

public class Practica {
    public static void main(String[] args) {
        int numeroMes = 2;
        String mes = "";

        switch (numeroMes) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            default:
                System.out.println("no existe el mes");
        }
        System.out.println("el mes es:" + mes);
}
}
