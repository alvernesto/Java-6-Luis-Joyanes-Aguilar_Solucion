/*
 * Construir un programa que indique si un número introducido por teclado es positivo,
igual a cero, o negativo; utilizar el operador ?:.
 */
package java6_problema_4_9;

import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_problema_4_9 {

    static Scanner input = new Scanner(System.in);
    static double a;
    static String salida = new String();

    public static void main(String[] args) {
        System.out.print("a = ");
        a = input.nextDouble();
        esMayorOMenor(a);
    }

    public static void esMayorOMenor(double a) {
        String salida = (a > 0) ? "a = " + a + " es mayor que cero" : (a == 0 ? "a = " + a + " es igual a cero" : "a = " + a + " es menor que cero");
        System.out.println(salida);
    }
}
