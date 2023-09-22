package org.example.herenciaYexcepciones.excepciones;

// LAS EXCEPCIONES EN TIEMPO DE EJECUCION
/* LOS METODOS EN JAVA USAN EXCEPCIONES PARA COMUNICAR QUE ALGO SALIO MAL, ES DECIR,
    QUE HUBO UNA FALLA.

    EL MECANISMO DE MANEJO DE EXCEPCIONES DE JAVA SE EMPLEA EN SITUACIONES EXCEPCIONALES

    SI SABEMOS QUE PODREMOS OBTENER UNA EXCEPCION CUANDO LLAMAMOS A UN METODO ENTONCES
    PODEMOS ESTAR PREPARADOS Y - TAL VEZ - RECUPERARNOS DEL ERROR. */


/*
    UNCHECKED
    LAS EXCEPCIONES NO CHEQUEADAS (RUNTIME EXCEPTION) SON AQUELLAS IRRECUPERABLES.
    AL SER EN TIEMPO DE EJECUCION NO ESTAMOS OBLIGADOS A MANEJARLAS PERO PODRIAMOS HACERLO.
 */
public class Unchecked {
    public static void main(String[] args) {
        int y = 24 ;
        int x = 0;

        try {
            int resultado = y / x;
            System.out.println(resultado);
        } catch (Exception error) {
            System.out.println("NO SE PUEDE DIVIDIR POR 0");
            System.out.println(error.getMessage());
            error.printStackTrace();
        }
    }
}
