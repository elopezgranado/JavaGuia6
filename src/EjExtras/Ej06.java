/*
    Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
    debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package EjExtras;

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
        int menCant = 0;
        double menAlt = 0, totAlt = 0;
        
        System.out.println(" *** ESTATURAS *** ");
        System.out.println("Indique la cantidad de personas a ingresar");
        int cant = leer.nextInt();
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese la altura de la persona "+(i+1));
            double alt = leer.nextDouble();
            
            if (alt < 1.6) {
                menCant += 1;
                menAlt += alt;
            }
            
            totAlt += alt;
        }
        
        System.out.println("De "+cant+" personas ingresadas, "+menCant+" miden menos de 1.60m y el promedio de altura es de "+menAlt/menCant+"m");
        System.out.println("El promedio de estatura en general es de "+totAlt/cant+"m");
    }
    
}
