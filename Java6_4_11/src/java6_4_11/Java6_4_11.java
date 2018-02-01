/*
 * Escribir un programa que lea dos números y visualice al mayor; utilizar el operador
ternario ?:.
 */
package java6_4_11;

import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_4_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número:  ");
        double a = input.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = input.nextDouble();
        mayorEs(a, b);
    }

    public static void mayorEs(double a, double b) {
        System.out.print("El número mayor es ");
        System.out.println(a > b ? a : b);

    }

}
