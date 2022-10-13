/*
    Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
    dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
    fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
    X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
    especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
    de FDE, que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
    incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
    siguientes funciones de Java Substring(), Length(), equals().
 */
package EjGuia6;

import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ok = 0, nok = 0;
        
        System.out.println("RS232");
        do {
            String cad = leer.nextLine();
            
            if (cad.length() == 5) {
                if (cad.substring(0, 1).equals("X") && cad.substring(4, 5).equals("O")) {
                    ok += 1;
                } else if (cad.equals("&&&&&")) {
                    break;
                } else {
                    nok += 1;
                }
            } else {
                nok += 1;
            }
        } while (true);
        
        System.out.println("INFORME");
        System.out.println("Lecturas correctas = "+ok);
        System.out.println("Lecturas incorrectas = "+nok);
    }
    
}
