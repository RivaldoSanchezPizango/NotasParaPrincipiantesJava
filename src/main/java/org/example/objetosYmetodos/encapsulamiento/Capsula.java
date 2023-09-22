package org.example.objetosYmetodos.encapsulamiento;

public class Capsula {
    public static void main(String[] args) {
        Encapsulamiento DatosPersona = new Encapsulamiento();

        try {
            DatosPersona.setNombre("Melvin");
            DatosPersona.setEdad(11);
            DatosPersona.setCasado(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // IMPRIME EL STACKTRACE (IMPRIME EL ERROR)
        };


        //System.out.println("Mi nombre es: " + DatosPersona.getNombre());
        //System.out.println("Tengo: " + DatosPersona.getEdad() + " anios.");
        //System.out.println("Tengo esposa: " + DatosPersona.getCasado());
    }
}
