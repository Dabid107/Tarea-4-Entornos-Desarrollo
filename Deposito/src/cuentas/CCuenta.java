/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;

/**
 *
 * @author David Castillo García
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *
     * Constructor sin parametros
     */
    public CCuenta()
    {
    }

    /**
     *
     * Constructor con todos los parametros
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de cuenta
     * @param sal Saldo disponible en la cuenta
     * @param tipo Tipo de interés que se cobra a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método que devuelve el saldo actual de la cuenta
     * @return Saldo disponible
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método que sirve para ingresar dinero en la cuenta bancaria
     * @param cantidad Cantidad que se pretende ingresar en la cuenta
     * @throws Exception No permite el ingreso de cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que sirve para retirar dinero de la cuenta bancaria
     * @param cantidad Cantidad de dinero que se quiere retirar
     * @throws Exception No permite la retirada de una cantidad negativa o igual que 0
     * @throws Exception  No permite retirar más dinero del que hay en la cuenta bancaria
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

   

    /**
     * 
     * Método que sirve para obtener el nombre del titular de la cuenta
     * @return El nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * Método que sirve para cambiar el nombre del titular de la cuenta
     * @param nombre Nombre del titular de la cuenta bancaria
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * Método que sirve para obtener el tipo de interés que afecta a la cuenta bancaria
     * @return Tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * Método que sirve para modificar el tipo de interés de la cuenta bancaria
     * @param tipoInterés Tipo de interés de la cuenta 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * 
     * Método que sirve para obtener el número de cuenta
     * @return Número de la cuenta bancaria
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * 
     * Método que sirve para cambiar el número de cuenta
     * @param cuenta Númmero de la cuenta bancaria
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * 
     * Método que devuelve el saldo disponible en la cuenta bancaria
     * @return El saldo disponible en la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * 
     * Método que sirve para cambiar el saldo disponible en la cuenta bancaria
     * @param saldo Saldo disponible
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
