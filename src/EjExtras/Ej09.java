/*
    Simular la división usando solamente restas. Dados dos números enteros mayores que
    uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
    Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
    resultado es el residuo, y el número de restas realizadas es el cociente.
    Por ejemplo: 50 / 13:
    50 – 13 = 37 una resta realizada
    37 – 13 = 24 dos restas realizadas
    24 – 13 = 11 tres restas realizadas
    dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
    ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package EjExtras;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 0, num2 = 0, coc = 0;
        
        do {
            System.out.println("Ingresar un número entero mayor que uno");
            num1 = leer.nextInt();
            System.out.println("Ingrese porque número desea dividirlo (que sea mayor que uno)");
            num2 = leer.nextInt();
        } while (num1 < 2 || num2 < 2);
        
        int res = num1;
        
        do {
            coc++;
            res -= num2;
        } while (res >= num2);
        
        System.out.println("El cociente de la división es "+coc);
        System.out.println("El residuo de la división es "+res);
    }
    
}
