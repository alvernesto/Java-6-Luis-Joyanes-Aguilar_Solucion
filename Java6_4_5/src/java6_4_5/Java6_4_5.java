/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6_4_5;
import java.util.Scanner; 
/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_4_5 {

    /** pag. 105 Escribir sentencias de asignación que permitan intercambiar los valores de dos variables.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("ingresa a = ");
        double a = entrada.nextDouble(); 
        System.out.print("ingresa b = ");
        double b = entrada.nextDouble();
        System.out.println("CAMBIO !!");
        double temp = a; 
        a=b; 
        b=temp; 
        System.out.println("a: " + a +  " b: " + b);
        
    }
    
}
