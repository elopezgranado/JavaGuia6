/*
    Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
    3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
    dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
    se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
    que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
    la matriz M en la cual empieza el primer elemento de la submatriz P.

    Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
    4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6
 */
package EjGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matrizM = new int[10][10];
        int [][] matrizP = new int[3][3];
        
        // Cargo matriz M
        System.out.println("\nMatriz M");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) (Math.random() * 100);
                System.out.print(matrizM[i][j]+" ");
            }
            System.out.println("");
        }
               
        // Cargo matriz P
        System.out.println("\nMatrizP");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //matrizP[i][j] = (int) (Math.random() * 100);
                matrizP[i][j] = matrizM[i+3][j+3];
                System.out.print(matrizP[i][j]+" ");
            }
            System.out.println("");
        }
        
        // Busco matriz P en matriz M
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < 8 && j < 8) {
                    if (matrizM[i][j] == matrizP[0][0] && matrizM[i][j+1] == matrizP[0][1] && matrizM[i][j+2] == matrizP[0][2]) {
                        if (matrizM[i+1][j] == matrizP[1][0] && matrizM[i+1][j+1] == matrizP[1][1] && matrizM[i+1][j+2] == matrizP[1][2]) {
                            if (matrizM[i+2][j] == matrizP[2][0] && matrizM[i+2][j+1] == matrizP[2][1] && matrizM[i+2][j+2] == matrizP[2][2]) {
                                System.out.println("\nLa matriz P se encuentra dentro de la matriz M en la posición inicial ["+i+","+j+"]");
                            }
                        }
                    }
                }
            }
        }
    }
    
}
