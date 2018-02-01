/*
 * Escribir un programa que lea dos enteros de tres dígitos y calcule e imprima producto,
cociente y resto cuando el primero se divide entre el segundo.
 */
package java6_problema_4_1;

import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_problema_4_1 {

    static Scanner input = new Scanner(System.in);
    static int a, b;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese... ");
        System.out.println(" ");
        System.out.print("x = ");
        a = input.nextInt();
        System.out.print("y = ");
        b = input.nextInt();
        boolean acceso = valida(a, b);
        if (acceso) {
            producto(a, b);
            cociente(a, b);
            resto(a, b);
        }else{System.out.println("El(los) número(s) no tiene(n) 3 dígitos");}
    }

    public static void producto(int a, int b) {
        System.out.println("x * y = " + a * b);
    }

    public static void cociente(int a, int b) {
        System.out.println("x / y = " + a / b);
    }

    public static void resto(int a, int b) {
        System.out.println("x % y = " + a % b);
    }

    public static boolean valida(int a, int b) {
        boolean acceso = false;
        int val_1 = a / 100;
        int val_2 = b / 100;
        if ((val_1 >= 1 && val_1 <= 9) && (val_2 >= 1 && val_2 <= 9)) {
            acceso = true;
        }
        return acceso;
    }
}
