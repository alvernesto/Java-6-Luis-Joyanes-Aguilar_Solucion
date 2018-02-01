/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java7_p_3_4;

import java.util.*;

/** pag 81
 *
 * @author Álvaro Ernesto
 */
public class Java7_p_3_4 {

    static char[] texto = new char[40];

    public static void main(String[] args) {
        /* '\nnn' -> 0 a 355 */

        for (int j = 0; j <= 39; j++) {
            for (int i = 0; i <= 39; i++) {
                int rand = (int) (355 * Math.random());
                texto [i] = (char)rand; 
                System.out.print(texto[i]);
                if (i == 39) {
                    System.out.println('\n');
                }
            }
        }

    }

}
