package org.example.objetosYmetodos;

public class InstanciaDelObjetoAnimal {
    public static void main(String[] args) {
        ObjetoAnimal firulais = new ObjetoAnimal();

        // INSTANCIA DE ATRIBUTOS
        firulais.nombre = "Tobby";
        firulais.color = "Blanco";
        firulais.edad = 8;
        firulais.raza = "Mestizo";

        System.out.println("El nombre del perro es: " + firulais.nombre);
        System.out.println("El color del perro es: " + firulais.color);
        System.out.println("La edad del perro es: " + firulais.edad);
        System.out.println("La raza del perro es: " + firulais.raza);

        // INSTACIA DE METODOS RECIBIMOS LOS PARAMETROS
        // INSTANCIA DE METODOS SIMPLES
        firulais.ladrar();

        // INSTANCIA DE METODOS ESTATICOS
        ObjetoAnimal.sobreNombrePerrito();

        // INSTANCIA DE METODOS ESTATICOS CON PARAMETROS
        ObjetoAnimal.textoAnimal("Los perros son asombrosos");
    }
}
