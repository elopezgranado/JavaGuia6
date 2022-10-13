/*
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package EjGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en °c");
        double C = leer.nextInt();
        
        double F = 32 + (9 * C / 5);
        
        System.out.println("Su equivalente en Fahrenheit es "+F+"°");
    }
    
}
