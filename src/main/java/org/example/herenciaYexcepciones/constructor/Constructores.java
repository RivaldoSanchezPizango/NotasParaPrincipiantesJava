package org.example.herenciaYexcepciones.constructor;

/* LA CARACTERISTICA PRINCIPAL DE UUN CONSTRUCTOR ES QUE SE EJECUTA ANTES QUE EL
    OBJETO SE ASIGNE A UNA REFERENCIA.

    ESTO BRINDA LA POSIBILIDAD DE "PARARSE" EN EL MEDIO DE LA CREACION DEL OBJETO
    Y HACER LO QUE SEA NECESARIO PARA DEJAR EL OBJETO LISTO PARA SER ASIGNADO. */
public class Constructores {
    String nombre;
    String apellido;
    int edad;


    // CONSTRUCTOR CON PARAMETROS

    public Constructores(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // CONSTRUCTOR SIN PARAMETROS
    public void Personas() {

    }


}
