/*
 * Escribir una sentencia lógica (boolean) que clasifique un entero x en una de las siguientes
categorías.
x < 0 o bien, 0 ≤ x ≤ 100 o bien, x > 100
 */
package java6_4_9;

import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_4_9 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Clasificador número entero");
        System.out.print("Ingrese número: ");
        int a = input.nextInt();
        if (a < 0) {
            System.out.println(" x < 0");

        } else {
            if (a >= 0 & a <= 100) {
                System.out.println("0 ≤ x ≤ 100");
            } else {
                System.out.println("x > 100");
            }
        }
    }
}
