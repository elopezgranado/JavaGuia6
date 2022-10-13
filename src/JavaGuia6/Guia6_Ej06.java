/*
 * EJERCICIO 6
    Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
    alguno de ellos es mayor a 25.
 */
package JavaGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Guia6_Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, num2;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        num = leer.nextInt();
        
        System.out.println("Ingrese otro número entero");
        num2 = leer.nextInt();
        
        if (num > 25 && num2 > 25) {
            System.out.println("Ambos números ingresados son mayores a 25");
        } else if (num > 25 || num2 > 25) {
            System.out.println("Uno de los números ingresados es mayor a 25");
        } else {
            System.out.println("Ninguno de los números ingresados es mayor a 25");
        }
    }
    
}
