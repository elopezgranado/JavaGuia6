/*
    Crea una aplicación que a través de una función nos convierta una cantidad de euros
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
    función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
    (void).
    El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
 */
package EjGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        
        System.out.println("Ingrese la cantidad de Euros a convertir");
        double euro = leer.nextDouble();
        
        do {
            System.out.println("Seleccione moneda de conversión");
            System.out.println("1 - Dólar");
            System.out.println("2 - Yen");
            System.out.println("3 - Libra");
            opc = leer.nextInt();
        } while (opc < 1 || opc > 3);
        
        convEuro(euro, opc);
    }
    
    public static void convEuro(double euro, int opc) {
        switch (opc) {
            case 1:
                System.out.println("La conversión de "+euro+"€ a dólares son u$d"+(1.28611*euro));
                break;
            case 2:
                System.out.println("La conversión de "+euro+"€ a yenes son "+(129.856*euro)+" yenes");
                break;
            case 3:
                System.out.println("La conversión de "+euro+"€ a libras son "+(0.86*euro)+" libras");
                break;
        }
    }
}
