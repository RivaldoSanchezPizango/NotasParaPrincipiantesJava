package org.example.interfacesYclasesAbstractas.interfaces.ejemplos;

public class Barcelona implements Equipo{

    @Override
    public void masculino() {
        System.out.println("El equipo no jugara la champions");
        System.out.println("El equipo jugara la europa league");
    }

    @Override
    public void esDeItalia() {
    }


    // SOBRECARGAS DE METODOS - reciben parametros diferentes
    public  void juvenilesMasculinos (int jugadoresTotales) {
        if (jugadoresTotales == 26) {
            System.out.println("Son 26 los jugadores totales");
        } else {
            System.out.println("No estan completos algunos estas afuera por lesion: " + jugadoresTotales);
        }
    }

    public void juvenilesMasculino (boolean Campeones) {
        if (Campeones == true) {
            System.out.println("salieron campeones");
        } else {
            System.out.println("Perdieron en semifinales");
        }
    }

}
