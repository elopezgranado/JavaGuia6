/*
    Realice un programa para que el usuario adivine el resultado de una multiplicación entre
    dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
    si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
    al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
    utilizar la función Math.random() de Java.
 */
package EjExtras;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int res = num1 * num2;
        boolean ok = false;
        
        System.out.println("Adivine el resultado de la multiplicación");
        int user = leer.nextInt();
        
        do {
            if (res == user) {
                System.out.println("¡¡¡Adivinaste!!!");
                System.out.println(num1+"x"+num2+"="+res);
                ok = true;
            } else {
                System.out.println("No acertó.. intente nuevamente");
                user = leer.nextInt();
            }
        } while (ok == false);
    }
    
}
