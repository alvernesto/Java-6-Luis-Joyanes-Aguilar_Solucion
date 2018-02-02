/*
 * Escribir un programa en el que se introduzca como dato de entrada la longitud del perímetro
de un terreno, expresada con tres números enteros que representen hectómetros,
decámetros y metros, respectivamente; escribir la longitud en decímetros con un rótulo
representativo.
 */
package java6_problema_4_6;
import java.util.Scanner; 
/**
 *
 * @author Álvaro Ernesto
 */
public class Java6_problema_4_6 {
static Scanner input = new Scanner(System.in);
static int hm, dam, m; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("hm = ");
        hm = input.nextInt();
        System.out.print("dam = ");
        dam = input.nextInt();
        System.out.print("m = ");
        m = input.nextInt();
        decimetrosTotal(hm , dam , m);
    }
    public static void decimetrosTotal (int hm, int dam, int m) {
    System.out.println("Total en decimetros");
    System.out.println(10*10*10*hm + 10*10*dam + 10*m + "[dm]");}
    
    
    
}
