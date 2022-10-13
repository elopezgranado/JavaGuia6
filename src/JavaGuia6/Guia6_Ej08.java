/*
 * EJERCICIO 8
    Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
    pedirá de nuevo hasta que la nota sea correcta.
 */
package JavaGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Guia6_Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese nota");
        nota = leer.nextInt();
        
        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese nota entre 0 y 10");
            nota = leer.nextInt();
        }
    }
    
}
