/*
 * EJERCICIO 12
    Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
    que el primer numero sea múltiplo del segundo e imprima si el primer numero es múltiplo del
    segundo, sino informe que no lo son.
 */
package JavaGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Guia6_Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        
        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt();
        
        EsMultiplo(num, num2);
    }
    
    public static void EsMultiplo(int num, int num2) {
        if (num % num2 == 0) {
            System.out.println("El número "+num+" es múltiplo de "+num2);
        } else {
            System.out.println("El número "+num+" NO es múltiplo de "+num2);
        }
    }
}
