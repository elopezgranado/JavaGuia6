/*
    Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package EjExtras;

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
        String letra;
        
        System.out.println("Ingrese una letra");
        letra = leer.nextLine();
        
        switch (letra.toUpperCase()) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("Ha ingresado una vocal");
                break;
            default:
                System.out.println("No ha ingresado una vocal");
                break;
        }
    }
    
}
