package org.example.collections;

public class Persona {
    private  int num;
    private String nombre;
    int edad;

    public Persona() {
    }

    public Persona(int num, String nombre, int edad) {
        this.num = num;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getNum() {
        return num;
    }
    public Persona setNum(int num) {
        this.num = num;
        return this;
    }

    public String getNombre() {
        return nombre;
    }
    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getEdad() {
        return edad;
    }
    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }
}
