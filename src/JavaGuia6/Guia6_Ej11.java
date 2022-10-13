/*
 * EJERCICIO 11
    Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
    en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
    reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
    vocales acentuadas) se mantienen sin cambios.
        a e i o u
        @ # $ % *
    Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
    correspondiente. Utilice la estructura “según” para la transformación.
    Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
    La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package JavaGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Guia6_Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        boolean punto = true;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese palabra o frase que finalice con un punto '.'");
            frase = codificar(leer.nextLine());
        } while (punto != frase.substring(frase.length()-1).equals("."));
        
        System.out.println("La frase codificada es: "+frase);
    }
    
    public static String codificar (String frase) {
        String codigo = "";
        
        for (int i = 0; i < frase.length(); i++) {
            
            switch (frase.substring(i, i+1)) {
                case "a":
                    codigo = codigo.concat("@");
                    break;
                case "e":
                    codigo = codigo.concat("#");
                    break;
                case "i":
                    codigo = codigo.concat("$");
                    break;
                case "o":
                    codigo = codigo.concat("%");
                    break;
                case "u":
                    codigo = codigo.concat("*");
                    break;
                default:
                    codigo = codigo.concat(frase.substring(i, i+1));
            }
        }
        
        return codigo;
    }
}
