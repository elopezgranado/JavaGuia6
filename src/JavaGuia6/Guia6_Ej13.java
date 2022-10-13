/*
 * EJERCICIO 13-14
    Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
    define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.

    Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
package JavaGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Guia6_Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre de tu compañero "+(i+1));
            Equipo[i] = leer.nextLine();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("El nombre de tu compañero "+(i+1)+" es: "+Equipo[i]);
        }
    }
    
}
