/*
 * EJERCICIO 10
    Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
    ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
    5 *****
    3 ***
    11 ***********
    2 **
 */
package JavaGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Guia6_Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, num2, num3, num4;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese valor para el 1er número (1-20)");
            num = leer.nextInt();
        } while (num < 1 || num > 20);
        
        do {
            System.out.println("Ingrese valor para el 2do número (1-20)");
            num2 = leer.nextInt();
        } while (num2 < 1 || num2 > 20);
        
        do {
            System.out.println("Ingrese valor para el 3er número (1-20)");
            num3 = leer.nextInt();
        } while (num3 < 1 || num3 > 20);
        
        do {
            System.out.println("Ingrese valor para el 4to número (1-20)");
            num4 = leer.nextInt();
        } while (num4 < 1 || num4 > 20);
        
        System.out.print(num+" ");
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        
        System.out.print(num2+" ");
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        
        System.out.print(num3+" ");
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        
        System.out.print(num4+" ");
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
    
}
