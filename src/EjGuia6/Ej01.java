/*
    Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
    dos. El programa deberá después mostrar el resultado de la suma
 */
package EjGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        
        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt();
        
        int suma = num + num2;
        
        System.out.println("El resultado de la suma es "+suma);
    }
    
}
