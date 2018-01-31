/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6_4_8;

import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x, y;
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Ingrese x = ");
        x = input.nextDouble();
        System.out.print("Ingrese y = ");
        y = input.nextDouble();
        suma(x, y);
    }
     public static void suma(double a, double b) {
        System.out.println( a + " + " + b + " = " + (a + b));
    }
}
