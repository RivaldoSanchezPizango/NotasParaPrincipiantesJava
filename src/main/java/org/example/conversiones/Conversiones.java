package org.example.conversiones;
/*
        CASTEO O CASTING
        cambiamos de un tipo de dato a otro
*/
public class Conversiones {
    public static void main(String[] args) {

        double estatura = 1.67;
        // CASTEO A ENTERO
        int estaturaInt = (int) estatura;
        // CASTEO A LONG
        long estaturaLong = (long) estaturaInt;

        System.out.println("DOUBLE " + estatura);
        System.out.println("INT " + estaturaInt);
        System.out.println("LONG " + estaturaLong);




        // CONVERSION
        String cantidad = "15";
        String precio = "150.34";

        int cantidadEntero = Integer.parseInt(cantidad);
        double cantidadPrecio = Double.parseDouble(precio);

        System.out.println("El valor de la compra es: " + (cantidadEntero * cantidadPrecio));



        int edad = 23;
        double metros = 24.34;

        String edadString = String.valueOf(edad);
        String metrosString = String.valueOf(metros);

        System.out.println("Edad: " + edadString + " estatura " + metrosString);
    }
}
