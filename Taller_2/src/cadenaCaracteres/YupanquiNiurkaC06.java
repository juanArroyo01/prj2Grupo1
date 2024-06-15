package cadenaCaracteres;

import java.util.Scanner;

public class YupanquiNiurkaC06 {
    public void serieCadenaCaracterC06(Scanner sc) {
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        String fraseMayusculas = frase.toUpperCase();
        String fraseInvertida = "";

        for (int i = fraseMayusculas.length() - 1; i >= 0; i--) {
            fraseInvertida += fraseMayusculas.charAt(i);
        }

        System.out.println("Resultado: " + fraseInvertida);
    }
}
