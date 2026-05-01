package cuentas;

/**
 * Autor: Roger Daniel Altamirano.
 * Archivo: Main.java.
 * Uso principal: Clase principal del proyecto. Crea una cuenta bancaria y llama
 * al método que agrupa la operativa básica de la cuenta.
 * Fecha de creación: 01/05/2026.
 */
public class Main {

    /**
     * Método principal de la aplicación.
     *
     * @param args argumentos recibidos por línea de comandos.
     */
    public static void main(String[] args) {
        CCuenta cuenta1;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 2300);
    }

    /**
     * * @autor Roger Daniel Altamirano.
     * @version 1.0
     * @date 30/04/2026
     * @param cuenta1 cuenta bancaria sobre la que se realizan las operaciones.
     * @param cantidad cantidad que se desea retirar de la cuenta.
     * @exception e fallo al retirar el dinero
     * @exception e fallo al ingresar dinero
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual;

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual + " Euros");

        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
