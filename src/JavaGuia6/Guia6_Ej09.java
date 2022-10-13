/*
 * EJERCICIO 9
    Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
    bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
    resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
    Nota: recordar el uso de la sentencia break.
 */
package JavaGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Guia6_Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, suma, cont;
        Scanner leer = new Scanner(System.in);
        suma = 0;
        cont = 0;
        
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            
            if (num > 0) {
                suma += num;
            }
            
            cont++;
            
            if (cont == 20) {
                break;
            }
            
        } while (num != 0);
        
        if (num == 0) {
            System.out.println("Se capturó el número cero");
        }
        
        System.out.println("La suma de los números ingresados es: "+suma);
    }
    
}
