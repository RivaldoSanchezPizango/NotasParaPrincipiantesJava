package org.example.relaciones;

public class Propietarios {
    private  Long id;
    private String nombre;
    private String apellido;

    @Override
    public String toString() {
        return "Propietarios{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public Propietarios() {
    }
    public  Propietarios(Long id, String nombre, String apellido ) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getId() {
        return id;
    }
    public Propietarios setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }
    public Propietarios setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }
    public Propietarios setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }
}
