/*
 * Ejercicios 1 - 5 de la Guía 6
 */
package JavaGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Guia6_Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Esteban";
        boolean bandera = true;
        char caracter = 'B';
        int numero = 12;
        double decimal = 0.1;
        
        int num2 = 10;
        
        int suma = numero + num2;
        double div = numero / num2;
        
        System.out.println("La suma de los números es: "+suma);
        System.out.println("La división de los númetos es: "+div);
        
        int edad = 33;
        
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu edad es: "+edad);
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 'true' si están bien los datos mostrados");
        bandera = leer.nextBoolean();
        
        System.out.println("La división no es correcta, ingrese valor 1.2");
        decimal = leer.nextDouble();
        
        //System.out.println("Ingrese la primer letra de su apellido");
        //caracter = leer.nextByte();
    }
    
}
