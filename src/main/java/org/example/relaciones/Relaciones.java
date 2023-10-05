package org.example.relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {
    public static void main(String[] args) {
        Autos car = new Autos();
        car.setId(1L);
        car.setMarca("Audi");
        car.setModelo("TT8");

        List <Propietarios> listaPropietarios = new ArrayList<Propietarios>();
        Propietarios prop1 = new Propietarios();
        Propietarios prop2 = new Propietarios();

        prop1.setId(24L);
        prop1.setNombre("Llud");
        prop1.setApellido("Sanchez");

        prop2.setId(25L);
        prop2.setNombre("Rosana");
        prop2.setApellido("Marquez");

        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);

        car.setListaPropietarios(listaPropietarios);

        System.out.println("EL auto:" + car.getMarca() + " " + car.getModelo() + "Tiene como porpietario a: " + car.getListaPropietarios().toString());
    }
}
