/*
 La fuerza de atracción entre dos masas, m1 y m2, separadas por una distancia d, está dada
por la fórmula:
F
G m m
d
=
∗ ∗ 1 2
2
donde G es la constante de gravitación universal G = 6.673 × 10–8 cm3/g ∙ seg2.
Escribir un programa que solicite la masa de dos cuerpos y la distancia entre ellos
para obtener su fuerza gravitacional. La salida debe ser en dinas; un dina es igual a g ·
cm/seg2.
 */
package java6_problema_4_8;
import java.util.Scanner;

/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_problema_4_8 {
static Scanner input = new Scanner(System.in);
static double mass1, mass2, d, G = 6.674E-11;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Ingrese masa primer planeta [kg] = ");
        mass1 = input.nextDouble();
        System.out.print("Ingrese masa segundo planeta [kg] = ");
        mass2 = input.nextDouble();
        System.out.print("Distancia [m] = ");
        d = input.nextDouble();
        fuerzaGrav(mass1, mass2, d);
    }
    public static void fuerzaGrav(double mass1, double mass2, double d) {
    System.out.println("F = " + G*mass1*mass2/Math.pow(d, 2) + " [N] ");}
    
}
