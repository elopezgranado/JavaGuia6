/*
    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
    usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido
 */
package EjGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numB;
        boolean flag = false;
        
        System.out.println("Dimensione el vector a cargar aleatoriamente");
        int num = leer.nextInt();
        
        int[] vector = new int[num];
        
        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        
        do {
            System.out.println("Indique que número desea buscar en el vector (0-9)");
            numB = leer.nextInt();
        } while (numB < 0 || numB > 9);
        
        for (int i = 0; i < num; i++) {
            //System.out.println(vector[i]);
            if (vector[i] == numB) {
                if (flag == false) {
                    System.out.println("El número buscado se encuentra en la posición del vector: "+i);
                    flag = true;
                } else {
                    System.out.println("Y se repite en la posición del vector: "+i);
                }
                
            }
        }
    }
    
}
