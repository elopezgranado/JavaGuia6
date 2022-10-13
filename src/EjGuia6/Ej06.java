/*
    Crear un programa que dado un numero determine si es par o impar.
 */
package EjGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El número ingresado es PAR");
        } else {
            System.out.println("El número ingresado es IMPAR");
        }
    }
    
}
