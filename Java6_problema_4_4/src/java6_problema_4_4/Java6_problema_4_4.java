/*
 Escribir un programa para convertir una medida dada en pies a sus equivalentes en
a) yardas, b) pulgadas, c) centímetros y d) metros (1 pie = 12 pulgadas, 1 yarda = 3 pies,
1 pulgada = 2.54 cm, 1 m = 100 cm). Después, ingresar el número de pies e imprimir el
número de yardas, pies, pulgadas, centímetros y metros.
 */
package java6_problema_4_4;

import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_problema_4_4 {

    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese magnitud");
        System.out.print("a [pie] = ");
        double pie = input.nextDouble();
        conversor(pie);
    }

    public static void conversor(double pie) {
        System.out.println(pie + " [pie] = " + pie * 12 + " [in] \t");
        System.out.println(pie + " [pie] = " + pie / 3 + " [yard] \t");
        System.out.println(pie + " [pie] = " + 12 * 2.54 * pie + " [cm] \t");
        System.out.println(pie + " [pie] = " + 12 * 2.54 * pie / 100 + " [m] \t");
    }

}
