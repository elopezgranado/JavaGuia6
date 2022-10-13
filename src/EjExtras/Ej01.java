/*
    Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package EjExtras;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int min = 0, hor = 0, dia = 0;
        
        System.out.println("Ingrese un tiempo en minutos");
        min = leer.nextInt();
        
        if (min >= 60) {
            hor = min / 60;
            min = min % 60;
            
            if (hor >= 24) {
                dia = hor / 24;
                hor = hor % 24;
            }
        }
        
        if (dia >= 1) {
            if (hor != 0) {
                if (min != 0) {
                    System.out.println("Su equivalente es "+dia+" días y "+hor+" hs y "+min+"'");
                } else {
                    System.out.println("Su equivalente es "+dia+" días y "+hor+" hs");
                }
            } else if (min != 0) {
                System.out.println("Su equivalente es "+dia+" días y "+min+"'");
            } else {
                System.out.println("Su equivalente es "+dia+" días");
            }
        } else {
            if (hor != 0) {
                if (min != 0) {
                    System.out.println("Su equivalente es "+hor+" hs y "+min+"'");
                } else {
                    System.out.println("Su equivalente es "+hor+" hs");
                }
            } else if (min != 0) {
                System.out.println("Su equivalente es "+min+"'");
            } else {
                System.out.println("Su equivalente es 0 ¡Daaale!");
            }
        }
    }
    
}
