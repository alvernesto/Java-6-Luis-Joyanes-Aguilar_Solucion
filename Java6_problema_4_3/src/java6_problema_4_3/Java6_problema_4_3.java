/*
 Este sistema de ecuaciones lineales
ax + by = c
dx + ey = f
se puede resolver con las siguientes fórmulas:
x
ce bf
ae bd
=
−
−
y
af cd
ae bd
=
−
−
Diseñar un programa que lea dos conjuntos de coeficientes (a, b, y c ; d, e y f) y visualice
los valores de x y y.
 */
package java6_problema_4_3;

import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_problema_4_3 {

    static Scanner input = new Scanner(System.in);
    static double a, b, c, d, e, f;
    static boolean acceso = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Resolución de sistema de ecuaciones 2x2");
        System.out.println("ax + by = c");
        System.out.println("dx + ey = f");
        System.out.println("...");
        System.out.println("Ingrese coeficientes");
        System.out.print("a:");
        a = input.nextDouble();
        System.out.print("b:");
        b = input.nextDouble();
        System.out.print("c:");
        c = input.nextDouble();
        System.out.print("d:");
        d = input.nextDouble();
        System.out.print("e:");
        e = input.nextDouble();
        System.out.print("f:");
        f = input.nextDouble();
        acceso = validarParalelismo(a,b,d,e);
        if (acceso) {
            resolver(a, b, c, d, e, f);
        } else {
            System.out.println("bye");
        }
    }

    public static void resolver(double a, double b, double c, double d, double e, double f) {
        System.out.println("x = " + (c * e - b * f) / (a * e - b * d) + " y = " + (a * f - c * d) / (a * e - b * d));
    }

    public static boolean validarParalelismo(double a, double b, double d, double e) {
        if (a / b == d / e) {
            System.out.println("Las rectas son paralelas!!");
            System.out.println("x -> inf & y -> inf");
            acceso = false;
            return acceso;
        }
        return acceso = true;
    }
}
