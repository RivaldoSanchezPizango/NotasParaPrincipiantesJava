package org.example.herenciaYexcepciones.herencia;

public class Animal {
    // DEFINIMOS LOS ATRIBUTOS
    private String nombre;
    private int edad;
    private String raza;
    private boolean isFriendly;
    private String color;
    private double peso;


    // DEFINIMOS LOS METODOS
    public void comer () {
        System.out.println("El animal esta comiendo");
    }
    public  void dormir () {
        System.out.println("El animal esta durmiendo");
    }


    // GETTERS Y SETTERS PARA LOS ATRIBUTOS
    public String getNombre() {
        return nombre;
    }
    public Animal setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getEdad() {
        return edad;
    }
    public Animal setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public String getRaza() {
        return raza;
    }
    public Animal setRaza(String raza) {
        this.raza = raza;
        return this;
    }

    public boolean isFriendly() {
        return isFriendly;
    }
    public Animal setFriendly(boolean friendly) {
        isFriendly = friendly;
        return this;
    }

    public String getColor() {
        return color;
    }
    public Animal setColor(String color) {
        this.color = color;
        return this;
    }

    public double getPeso() {
        return peso;
    }
    public Animal setPeso(double peso) {
        this.peso = peso;
        return this;
    }
}
