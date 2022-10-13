/*
    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
    cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
 */
package EjGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero (tamaño del lado) - CUADRADRO");
        int num = leer.nextInt();
        
        int cont = -3;
        
        for (int i = 0; i < num; i++) {
            System.out.print("* ");
            cont += 2;
        }
        
        System.out.println("");
        
        if (num > 2) {
            for (int i = 2; i < num; i++) {
                System.out.print("*");
                
                for (int j = 0; j < cont; j++) {
                    System.out.print(" ");
                }
                
                System.out.print("*");
                System.out.println("");
            }
        }
        
        for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
        
        System.out.println("");
    }
    
}
