/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6_4_4;

import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_4_4 {

    /**
     * pag 105 Escribir un programa que lea un entero, lo multiplique por dos y
     * a continuación lo escriba en pantalla.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este programa te hará una maravillosa división por 2 !!");
        System.out.print("Ingresa un valor: ");
        double a = entrada.nextDouble(); // TODO code application logic here
        System.out.println("El valor " + a + "/2 = " + a / 2);
    }

}
