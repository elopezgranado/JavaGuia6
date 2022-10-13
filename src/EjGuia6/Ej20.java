/*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
    suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
    permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
    El programa deberá comprobar que los números introducidos son correctos, es decir,
    están entre el 1 y el 9.
 */
package EjGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej20 {
    
    public static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
	
        CargaMatriz(matriz);
	EvaluoMatriz(matriz);
    }

    public static void CargaMatriz(int[][] matriz) {
	int num = 0;
        // Lleno la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un número entre 1 y 9 para la posición ["+i+","+j+"]");
                    num = leer.nextInt();
                } while (num < 1 || num > 9);
                matriz[i][j] = num;
            }
        }
    }

    public static void EvaluoMatriz(int[][] matriz) {
	int sumaF = 0;
	int sumaD1 = 0;
	int sumaD2 = 0;
	int sumaC = 0;
	int sumaA = 0;
	int sumaB = 0;
	boolean magic = true;
	
        // Sumo los elementos de la matriz si es MAGICA y muestro la misma con su resultado
        System.out.println("*** Matriz ***");
	
        for (int i = 0; i < 3; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 3; j++) {
                if (j != 2) {
                    System.out.print(matriz[i][j]+", ");
                } else {
                    System.out.print(matriz[i][j]);
                }
                if (i == j) {
                    sumaD1 += matriz[i][j];
                }
                if (i + j == 2) {
                    sumaD2 += matriz[i][j];
                }
                sumaF += matriz[i][j];
                sumaC += matriz[j][i];
            }
            if (i == 0) {
                sumaA = sumaF;
                sumaB = sumaC;
            } else {
                if (sumaA != sumaF && sumaB != sumaC) {
                    magic = false;
                }
            }
            sumaF = 0;
            sumaC = 0;
            System.out.println(" ]");
        }
        
	if (magic) {
            if (sumaA == sumaD1 && sumaA == sumaD2) {
                System.out.println("¡¡¡ ES MÁGICO !!!");
                System.out.println("La suma de las filas, las columnas y las diagonales es "+sumaA);
            }
        }
    }
    
}
