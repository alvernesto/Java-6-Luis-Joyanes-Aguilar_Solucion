/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6_4_6;
import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_4_6 {
static Scanner input; 
    /**
     * pag 105 Escribir un programa que lea dos enteros en las variables x y y,
     * y a continuación obtenga los valores de: 1. x / y, 2. x % y; después,
     * ejecutar el programa varias veces con diferentes pares de enteros como
     * entrada.
     */
    public static void main(String[] args) {
        int i=1;
        System.out.print("Ingresa el valor[" + i + "] = ");
        input = new Scanner(System.in);
        double a =  input.nextDouble(); 
        System.out.print("Ingresa el valor[" + ++i + "] = ");
        double b = input.nextDouble(); 
        division(a,b);
        resto (a,b);
    }
public static void division (double a, double b) {
System.out.println("a/b = " + a/b);}
public static void resto (double a, double b) {
System.out.println("a%b = " + a%b); }
}
