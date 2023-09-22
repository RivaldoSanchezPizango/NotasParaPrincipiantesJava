package org.example.herenciaYexcepciones.herencia;

import java.util.Objects;

// ASI HEREDAMOS LA CLASE ANIMAL
public class Perro {
    String nombre;
    String raza;
    int edad;

    // SOBREESCRIBIMOS LOS METODOS CON @OVERRIDE
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true; // evaluamos si el objeto hace referencia la mismo espacio en memoria
        if (o == null || getClass() != o.getClass()) // evaluamos si esta basado en la misma clase
            return false;
        Perro perro = (Perro) o;
        return Objects.equals(nombre, perro.nombre) && edad == perro.edad && Objects.equals(raza, perro.raza); // evaluamos si las propiedades son las mismas
    };

    @Override
    public int hashCode () {
        return Objects.hash(nombre, edad, raza);
    };

    public String getNombre() {
        return nombre;
    };

    public Perro setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    };

    public String getRaza() {
        return raza;
    };

    public Perro setRaza(String raza) {
        this.raza = raza;
        return this;
    };

    public int getEdad() {
        return edad;
    };

    public Perro setEdad(int edad) {
        this.edad = edad;
        return this;
    };
};
