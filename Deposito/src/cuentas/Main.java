/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package cuentas;

/**
 *
 * @author david
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldo;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldo = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldo );

        operativa_cuenta(cuenta1, 0);
    }

    /**
     * Método por el que se realiza una retirada de dinero y después un ingreso
     * @param cuenta1 Objeto que corresponde a la clase CCuenta creado en el método main
     * @param cantidad Cantidad de dinero que se retira y se ingresa en la cuenta
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
