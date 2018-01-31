/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6_4_7;

import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_4_7 {

    /**
     * pag 105 Escribir un programa que solicite ingresar longitud y anchura de
     * una habitación; hecho esto, visualice su superficie con esos datos.
     */
    public static void main(String[] args) {
        double altura, anchura;
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Ingrese altura = ");
        altura = input.nextDouble();
        System.out.print("Ingrese anchura = ");
        anchura = input.nextDouble();
        superficie(altura, anchura);

    }

    public static void superficie(double altura, double anchura) {
        System.out.println("Superficie = " + altura * anchura);
    }
}
