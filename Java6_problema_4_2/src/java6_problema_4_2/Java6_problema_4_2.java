/*
 *Diseñe un programa que convierta una temperatura en grados Celsius a Fahrenheit.
 */
package java6_problema_4_2;

import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_problema_4_2 {

    static Scanner input = new Scanner(System.in);
    static double tC, tF;
    static boolean acceso = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese temperatura en °C...");
        System.out.print("°C : ");
        tC = input.nextDouble();
        acceso = validar(tC);
        farenheit(tC, acceso);
    }

    public static void farenheit(double a, boolean acceso) {
        if (acceso) {
            tF = (9 / 4) * a + 32;
            System.out.println("°C: " + a + " °F : " + tF);
        } else {
            System.out.println("No existe temperatura bajo el cero absoluto (<-273°C)");
        }
    }

    public static boolean validar(double a) {
        if (a < -273) {
            acceso = false;
        }
        return acceso;
    }

}
