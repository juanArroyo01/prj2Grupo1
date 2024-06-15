package cadenaCaracteres;

import Utils.DataReader.KeyReader;

public class YupanquiNiurkaC06 {
    public void serieCadenaCaracterC06() {
        System.out.print("Ingrese una frase: ");
        String frase = KeyReader.cadenaFlujoEntrada();
        
        String fraseMayusculas = frase.toUpperCase();
        String fraseInvertida = "";

        for (int i = fraseMayusculas.length() - 1; i >= 0; i--) {
            fraseInvertida += fraseMayusculas.charAt(i);
        }

        System.out.println("Resultado: " + fraseInvertida);
    }
}
