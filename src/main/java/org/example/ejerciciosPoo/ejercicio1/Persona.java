package org.example.ejerciciosPoo.ejercicio1;
/*
    CAJERO AUTOMATICO
    CREAR UNA CLASE PERSONA QUE TENGA UN CAJERO Y QUE EL CAJERO TENGA UNA CUENTA.
    LA CLASE PERSONA DEBE TENER UN METODO RETIRAR QUE RECIBA UN MONTO  Y LO RETIRE DE LA CUENTA DEL CAJERO
*/
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public  Persona () {

    }

    public Persona(String nombre, String apellido, int edad, String dni, CuentaBancaria cuentaBancaria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getNombre() {
        return nombre;
    }
    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }
    public Persona setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public int getEdad() {
        return edad;
    }
    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public String getDni() {
        return dni;
    }
    public Persona setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
    public Persona setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        return this;
    }

    public String mostrarDatos() {
        return "Nombre: " + this.nombre + "\n apellido: " + this.apellido + "\nEdad" + this.edad + "\nDNI: " + this.dni +
                "\n Cuenta Bancaria: " + this.cuentaBancaria.getNumeroCuenta() + "\n Saldo: " + this.cuentaBancaria.getSaldo();
    }

    public String bienvenido () {
        return "Bienvenido " + this.nombre + " " + this.apellido;
    }
}
