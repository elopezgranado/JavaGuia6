/*
    Una obra social tiene tres clases de socios:
        o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
        todos los tipos de tratamientos.
        o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
        los mismos tratamientos que los socios del tipo A.
        o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
        tratamientos.
        o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
        real que represente el costo del tratamiento (previo al descuento) y determine el
        importe en efectivo a pagar por dicho socio.
 */
package EjExtras;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String clase;
        
        do {
            System.out.println("Ingrese la clase del socio a tratar");
            clase = leer.nextLine();
        } while (!clase.equalsIgnoreCase("A") && !clase.equalsIgnoreCase("B") && !clase.equalsIgnoreCase("C"));
        
        System.out.println("Ingrese el costo del tratamiento");
        double costo = leer.nextDouble();
        
        switch (clase.toUpperCase()) {
            case "A":
                System.out.println("El importe con el descuento aplicado del 50% es $"+costo*0.5);
                break;
            case "B":
                System.out.println("El importe con el descuento aplicado del 35% es $"+costo*0.65);
                break;
            case "C":
                System.out.println("El importe no tiene descuento $"+costo);
                break;
        }
    }
    
}
