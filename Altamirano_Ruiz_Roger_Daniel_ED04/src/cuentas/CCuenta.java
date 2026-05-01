package cuentas;

/**
 * @author Roger Daniel Altamirano.
 * 
 * básicas como consultar el saldo, ingresar dinero y retirar dinero.
 * Fecha 30/04/2026.
 */
public class CCuenta {

    /**
     * Atributo "nombre" del titular de la cuenta bancaria.
     */
    private String nombre;

    /**
     * Atributo "cuenta" como numero identificativo de la cuenta bancaria.
     */
    private String cuenta;

    /**
     * Atributo tipo double "saldo" disponible en la cuenta bancaria.
     */
    private double saldo;

    /**
     * Atributo Tipo de interés asociado a la cuenta bancaria.
     */
    private double tipoInteres;

    /**
     * Constructor vacío de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros de la clase CCuenta.
     *
     * @param nom nombre del titular de la cuenta.
     * @param cue número identificativo de la cuenta bancaria.
     * @param sal saldo inicial de la cuenta.
     * @param tipo tipo de interés asociado a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * Asigna un nombre al titular de la cuenta.
     *
     * @param nom nuevo nombre del titular.
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return nombre del titular.
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Consulta el saldo actual de la cuenta.
     *
     * @return saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     *
     * @param cantidad que se desea ingresar.
     * @throws Exception si la cantidad introducida es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     *
     * @param cantidad cantidad que se desea retirar.
     * @throws Exception si la cantidad es negativa, cero o si no hay saldo suficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * Obtiene el número identificativo de la cuenta.
     *
     * @return número de cuenta.
     */
    public String obtenerCuenta() {
        return cuenta;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del titular de la cuenta.
     *
     * @param nombre nuevo nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número identificativo de la cuenta.
     *
     * @return número de cuenta. 
     * NoTA: es redundante con la función obtenerCuenta(), pero por 
     * cumplir con la encapsulación, lo añado.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Modifica el número identificativo de la cuenta.
     *
     * @param cuenta nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo disponible en la cuenta.
     *
     * @return saldo disponible.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modifica el saldo disponible en la cuenta.
     *
     * @param saldo nuevo saldo disponible.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés asociado a la cuenta.
     *
     * @return tipo de interés.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Modifica el tipo de interés asociado a la cuenta.
     *
     * @param tipoInteres
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
