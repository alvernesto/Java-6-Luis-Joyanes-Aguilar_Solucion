/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6_problema_4_5;

import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_problema_4_5 {

    static Scanner input = new Scanner(System.in);
    static boolean acceso = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Cálculo volumen radio [r] altura [h]");
        System.out.print("r = ");
        double r = input.nextDouble();
        System.out.print("h = ");
        double h = input.nextDouble();
        acceso = validar(r, h);
        volumen(r, h, acceso);
    }

    public static void volumen(double r, double h, boolean acceso) {
        if (acceso) {
            System.out.println("Volumen = " + Math.PI * Math.pow(r, 2) * h + "[unit]^3");
        } else {
            System.out.println("radio y/o altura negativos.");
        }
    }

    public static boolean validar(double r, double h) {
        acceso = r >= 0 && h >= 0;
        return acceso;
    }
}
