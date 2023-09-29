package org.example.interfacesYclasesAbstractas.interfaces.ejemplos;

public class Prueba {
    public static void main(String[] args) {
        Juventus juveJuvenilA = new Juventus();
        Barcelona barcaJuvenilA = new Barcelona();

        juveJuvenilA.masculino();
        juveJuvenilA.esDeItalia();

        barcaJuvenilA.masculino();
        barcaJuvenilA.esDeItalia();

        barcaJuvenilA.juvenilesMasculinos(26);
        barcaJuvenilA.juvenilesMasculino(false);

    }
}
