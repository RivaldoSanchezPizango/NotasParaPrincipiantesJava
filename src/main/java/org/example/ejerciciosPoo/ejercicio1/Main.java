package org.example.ejerciciosPoo.ejercicio1;

 // DESPLEGA UNA VENTANA
import javax.swing.JOptionPane;

public class Main {

    public static String menu() {
        return "1. Depositar\n 2. Extraer \n 3. Ver Saldo \n 4. Ver datos \n 5. Salir";
    }

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("2344-3434-3343",10000);
        Persona persona = new Persona("Rivaldo", "Sanchez", 21, "58594895", cuenta);

        // Muestra mensaje
        JOptionPane.showMessageDialog(null, "Bienvenido","Bienvenido", 1);

        int opcion = 0;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu(), "Menu", 3));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opcion invalida", "Error", 0);
            }

            switch (opcion) {
                case 1:
                double monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a depositar", "Deposito", 3));
                    persona.getCuentaBancaria().depositar(monto);
                    break;

                case 2:
                    monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a extraer", "Deposito", 3));
                    persona.getCuentaBancaria().extraer(monto);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Su saldo es de: " + persona.getCuentaBancaria().getSaldo());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, persona.mostrarDatos(), "Datos", 1);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa", "Salida", 1);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida", "Error", 0);
                    break;
            }
        } while (opcion != 5);

    }
}
