package org.example.objetosYmetodos.encapsulamiento;

public class Encapsulamiento {
    String nombre;
    int edad;
    Boolean casado;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) throws Exception  {
        if (edad < 12) {
            // ARROJA UNA NUEVA EXCEPCION
            throw new Exception("La Edad no puede ser menor que 12");
        } else {
            this.edad = edad;
        }
    }

    public boolean getCasado () {
        return casado;
    }
    public void setCasado(boolean casado) {
        this.casado = casado;
    }
}
