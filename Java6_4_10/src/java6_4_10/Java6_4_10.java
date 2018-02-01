/*
 * Escribir un programa que introduzca el número de un mes (1 a 12) y visualice el número
de sus días.
 */
package java6_4_10;


import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_4_10 {

    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salida = true;
        do {
            System.out.println("Ingresa un mes del año[1-12] y entérate cuántos días tiene");
            System.out.print("MES : ");
            int mes = input.nextInt();
            if (mes >= 1 & mes <= 12) {
                if (mes == 1) {
                    System.out.println("enero tiene 31 días");
                } else {
                    if (mes == 2) {
                        System.out.println("febrero tiene 28/29 días");
                    } else {
                        if (mes == 3) {
                            System.out.println("marzo tiene 31 días");
                        } else {
                            if (mes == 4) {
                                System.out.println("abril tiene 30 días");
                            } else {
                                if (mes == 5) {
                                    System.out.println("mayo tiene 31 días");
                                } else {
                                    if (mes == 6) {
                                        System.out.println("junio tiene 30 días");
                                    } else {
                                        if (mes == 7) {
                                            System.out.println("julio tiene 31 días");
                                        } else {
                                            if (mes == 8) {
                                                System.out.println("agosto tiene 31 días");
                                            } else {
                                                if (mes == 9) {
                                                    System.out.println("septiembre tiene 30 días");
                                                } else {
                                                    if (mes == 10) {
                                                        System.out.println("octubre tiene 31 días");
                                                    } else {
                                                        if (mes == 11) {
                                                            System.out.println("noviembre tiene 30 días");
                                                        } else {
                                                            if (mes == 12) {
                                                                System.out.println("diciembre tiene 31 días");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println("¿Salida? [true/false]");
                salida = input.nextBoolean();
            } else {
                System.out.println("No existe el mes [1/12]");
                salida = false;
            }
        } while (salida == true);
    }
}
