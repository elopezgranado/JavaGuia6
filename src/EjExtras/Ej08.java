/*
    Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
    detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
    la cantidad de números impares. Al igual que en el ejercicio anterior los números
    negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package EjExtras;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0, cant = 0, par = 0, impar = 0;
        
        do {
            System.out.println("Ingrese un número entero");
            num = leer.nextInt();
            
            if (num % 5 == 0) {
                break;
            } else if (num > 0) {
                cant++;
                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        } while (num % 5 != 0);
        
        System.out.println("Cantidad de números leídos  = "+cant);
        System.out.println("Cantidad de números pares   = "+par);
        System.out.println("Cantidad de números impares = "+impar);
    }
    
}
