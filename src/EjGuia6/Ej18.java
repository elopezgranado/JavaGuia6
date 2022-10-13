/*
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
    traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
    cambiando sus filas por columnas (o viceversa).
 */
package EjGuia6;

/**
 *
 * @author A305649
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] mA = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mA[i][j] = (int) (Math.random() * 10);
            }
        }
        
        System.out.println("Matriz Original:");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mA[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("Matriz Traspuesta:");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mA[j][i]);
            }
            System.out.println("");
        }
    }
    
}
