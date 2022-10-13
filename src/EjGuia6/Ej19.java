/*
    Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
    matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
    signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
    denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package EjGuia6;

/**
 *
 * @author A305649
 */
public class Ej19 {

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
        
        System.out.println("Matriz Anti Simétrica:");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mA[j][i]*-1);
            }
            System.out.println("");
        }
    }
    
}
