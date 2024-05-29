/* 
package Test;

import java.util.Scanner;
import serieCaracteres.CasaAntonelasc;
import serieNumerica.CasaAntonelasn;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        // Creacion de propios metodos y variables
        System.out.println("\n--> Taller 2 <--\n");

        CasaAntonelasn sn3 = new CasaAntonelasn();
        CasaAntonelasn sn9 = new CasaAntonelasn();
        CasaAntonelasc sc3 = new CasaAntonelasc();
        CasaAntonelasc sc9 = new CasaAntonelasc();

        int numero = -1;
        
        while (true) {
            System.out.print("Cantidad de elementos en la serie: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    break;
                } else {
                    System.out.println("El número debe ser mayor a cero. Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                sc.next(); // Limpiar la entrada inválida
            }
        }
        
        // Asegúrate de llamar al método correcto aquí
        //sn3.caSn3(numero);
        // sn9.caSn9(numero);
        //sc3.caSc3(numero);
         sc9.caSc9(numero);
    }
}
*/