/*
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
    números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package EjGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor límite positivo");
        int lim = leer.nextInt();
        int sum = 0;
        
        do {
            System.out.println("Ingrese un número");
            int num = leer.nextInt();
            sum += num;
        } while (sum<=lim);
        
        System.out.println("La suma de los números ingresados es "+sum+", superando el límite inicial "+lim);
    }
    
}
