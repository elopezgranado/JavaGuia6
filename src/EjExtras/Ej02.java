/*
    Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
    una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
    tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
    iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package EjExtras;

/**
 *
 * @author A305649
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 19, B = 15, C = 5, D = 31, aux;
        
        System.out.println("Valores iniciales");
        System.out.println("A = "+A);
        System.out.println("B = "+B);
        System.out.println("C = "+C);
        System.out.println("D = "+D);
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("\nValores finales");
        System.out.println("A = "+A);
        System.out.println("B = "+B);
        System.out.println("C = "+C);
        System.out.println("D = "+D);
    }
    
}
