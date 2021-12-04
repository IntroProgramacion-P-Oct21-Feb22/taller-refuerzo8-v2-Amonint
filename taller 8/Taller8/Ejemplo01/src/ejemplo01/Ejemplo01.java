/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre = " ";
        int cedula;
        int clientetipo;
        int numerocomputadoras;
        double descuento1 = 1;
        double descuento2 = 5;
        double descuento3 = 10;
        double descuento4 = 15;
        double porcentaje;
        double porcentaje2;
        double porcentaje3;
        double porcentaje4;
        String computador; 
        String computadora1 = "Computadora con valor de $1000";
        String computadora2 = "Computadora con valor de $1100";
        String computadora3 = "Computadora con valor de $900";
        String bandera = "si";
        double total = 0;
        double subtotal;
        String cadena_1 = " ";
        int computadoraprecio = 0;
        double suma_pagar = 0;
        
        System.out.printf("Nuestos productos son : \n%s\n%s\n%s\n",
                computadora1,
                computadora2,
                computadora3);
        while (bandera.equals("si")) {
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su Cédula");
        cedula = entrada.nextInt();
        System.out.println("Ingrese que tipo de cliente es 1, 2, 3, 4");
        clientetipo = entrada.nextInt();
        System.out.println("Ingresar la cantidad de computadoras a comprar: ");
            numerocomputadoras = entrada.nextInt();
            computador = entrada.nextLine();
            if (computador.equals("Computador 1")|| (computador.equals("1"))) {
                computadoraprecio = 1000;
                if (clientetipo == 1) {
                    subtotal = (computadoraprecio * descuento1) / 100;
                    total = computadoraprecio - subtotal;
                } else {
                    if (clientetipo == 2) {
                        subtotal = (computadoraprecio * numerocomputadoras);
                            porcentaje = (subtotal * descuento2)/100;
                            total = computadoraprecio - porcentaje;

                    } else {
                        if (clientetipo == 3) {
                            subtotal = (computadoraprecio * numerocomputadoras);
                            porcentaje = (subtotal * descuento3)/100;
                            total = computadoraprecio - porcentaje;

                        } else {
                            subtotal = (computadoraprecio * numerocomputadoras);
                            porcentaje = (subtotal * descuento4)/100;
                            total = computadoraprecio - porcentaje;
                        }
                    }
                }
            } else {
                if (computador.equals("Computador 2")|| (computador.equals("2"))) {
                    computadoraprecio = 1100;
                    if (clientetipo == 1) {
                        subtotal = (computadoraprecio * numerocomputadoras);
                        porcentaje = (subtotal * descuento1)/100;
                        total = computadoraprecio - porcentaje;
                    } else {
                        if (clientetipo == 2) {
                            subtotal = (computadoraprecio * numerocomputadoras);
                            porcentaje = (subtotal * descuento2)/100;
                            total = computadoraprecio - porcentaje;

                        } else {
                            if (clientetipo == 3) {
                                subtotal = (computadoraprecio * numerocomputadoras);
                            porcentaje = (subtotal * descuento3)/100;
                            total = computadoraprecio - porcentaje;

                            } else {
                                subtotal = (computadoraprecio * numerocomputadoras);
                                porcentaje = (subtotal * descuento4)/100;
                                total = computadoraprecio - porcentaje;
                            }
                        }
                    }
                } else {
                    if (computador.equals("Computador 3")|| (computador.equals("3"))) {
                        computadoraprecio = 900;
                        if (clientetipo == 1) {
                            subtotal = (computadoraprecio * numerocomputadoras);
                            porcentaje = (subtotal * descuento1)/100;
                            total = computadoraprecio - porcentaje;
                        } else {
                            if (clientetipo == descuento2) {
                                subtotal = (computadoraprecio * numerocomputadoras);
                                porcentaje = (subtotal * descuento2)/100;
                                total = computadoraprecio - porcentaje;

                            } else {
                                if (clientetipo == 3) {
                                    subtotal = (computadoraprecio * numerocomputadoras);
                                    porcentaje = (subtotal * descuento3)/100;
                                    total = computadoraprecio - porcentaje;

                                } else {
                                    subtotal = (computadoraprecio * numerocomputadoras);
                                    porcentaje = (subtotal * descuento4)/100;
                                    total = computadoraprecio - porcentaje;
                                }
                            }
                        }
                    }
                }
            }
            cadena_1 = String.format("%s-Cliente con %s, con cédula %d,"
                    + " compra %d computadoras con precio individual $ %d."
                    + " Total a pagar $ %.2f.\n "
                    , cadena_1
                    , nombre
                    , cedula
                    , numerocomputadoras
                    , computadoraprecio
                    , total);
            suma_pagar = suma_pagar + total;
            System.out.println("¿Desea ingresar más datos?[Si/No]");
            entrada.nextLine();
            bandera = entrada.nextLine();  
        }
        System.out.printf("%s\nTotal venta de computadoras:%s\n"
                          , cadena_1
                          , suma_pagar);
        }
    }
        
 

