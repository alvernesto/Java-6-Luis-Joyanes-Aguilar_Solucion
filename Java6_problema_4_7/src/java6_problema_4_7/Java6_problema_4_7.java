/*
 * Escribir un programa para obtener la hipotenusa y los ángulos agudos de un triángulo
rectángulo a partir de las longitudes de los catetos.
 */
package java6_problema_4_7;

import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_problema_4_7 {

    static Scanner input = new Scanner(System.in);
    static double cat1, cat2, hip, angAlfa, angBeta;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Ingrese primer cateto = ");
        cat1 = input.nextDouble();
        System.out.print("Ingrese segundo cateto = ");
        cat2 = input.nextDouble();
        hip = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
        angAlfa = Math.asin(cat1/hip);
        angBeta = Math.asin(cat2/hip);
        System.out.println("hipotenusa = " + hip);
        System.out.println("angulo = " + angAlfa);
        System.out.println("angulo = " + angBeta);
        
    }

}
