/*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
    en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package EjGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        System.out.println("La frase en MAYÚSCULAS es: "+frase.toUpperCase());
        System.out.println("La frase en minúsculas es: "+frase.toLowerCase());
    }
    
}
