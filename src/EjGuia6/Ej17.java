/*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package EjGuia6;

/**
 *
 * @author A305649
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector[] = new int[33];
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        
        for (int i = 0; i < 33; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
        
        for (int i = 0; i < 33; i++) {
            //System.out.println(vector[i]);
            if (vector[i] < 10) {
                cont1 += 1;
            } else if (vector[i] < 100) {
                cont2 += 1;
            } else if (vector[i] < 1000) {
                cont3 += 1;
            } else if (vector[i] < 10000) {
                cont4 += 1;
            } else {
                cont5 += 1;
            }
        }
        
        System.out.println("Números de 1 dígito  = "+cont1);
        System.out.println("Números de 2 dígitos = "+cont2);
        System.out.println("Números de 3 dígitos = "+cont3);
        System.out.println("Números de 4 dígitos = "+cont4);
        System.out.println("Números de 5 dígitos = "+cont5);
    }
    
}
