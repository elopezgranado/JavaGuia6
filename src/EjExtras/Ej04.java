/*
    Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
    equivalente en romano.
 */
package EjExtras;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        
        do {
            System.out.println("Ingrese un número entre 1 y 10");
            num = leer.nextInt();
        } while (num < 1 || num > 10);
        
        switch (num) {
            case 1:
                System.out.println("Su equivalente en romano es 'I'");
                break;
            case 2:
                System.out.println("Su equivalente en romano es 'II'");
                break;
            case 3:
                System.out.println("Su equivalente en romano es 'III'");
                break;
            case 4:
                System.out.println("Su equivalente en romano es 'IV'");
                break;
            case 5:
                System.out.println("Su equivalente en romano es 'V'");
                break;
            case 6:
                System.out.println("Su equivalente en romano es 'VI'");
                break;
            case 7:
                System.out.println("Su equivalente en romano es 'VII'");
                break;
            case 8:
                System.out.println("Su equivalente en romano es 'VIII'");
                break;
            case 9:
                System.out.println("Su equivalente en romano es 'IX'");
                break;
            case 10:
                System.out.println("Su equivalente en romano es 'X'");
                break;
        }
    }
    
}
