/*
    Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
    de n números (n>0). El valor de n se solicitará al principio del programa y los números
    serán introducidos por el usuario. Realice dos versiones del programa, una usando el
    bucle “while” y otra con el bucle “do - while”.
 */
package EjExtras;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cant = 0;
        double max = -1000000, min = 1000000, prom = 0;
        
        //do {
        while (cant < 1) {
            System.out.println("Ingrese la cantidad de números a procesar (>0)");
            cant = leer.nextInt();
        }
        //} while (cant < 1);
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese un número");
            double num = leer.nextDouble();
            
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
            
            prom += num;
        }
        
        System.out.println("El valor máximo ingresado es "+max);
        System.out.println("El valor mínimo ingresado es "+min);
        System.out.println("El promedio de los números ingresados es "+prom/cant);
    }
    
}
