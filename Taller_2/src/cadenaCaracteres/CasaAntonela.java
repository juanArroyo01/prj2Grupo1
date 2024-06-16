package cadenaCaracteres;

import Utils.DataReader.KeyReader;

public class CasaAntonela {
    public void Cadenacaracteres03Ac() {
        /*
         *  Pedir una frase y una vocal, eliminar la vocal ingresada de la frase. 
         * Ejemplo, frase: ballena azul  
         * letra : l
         * salida: ba  ena azu 
         */
        System.out.println("Ingrese una frase: ");
        String frase = KeyReader.cadenaFlujoEntrada(); // Usar KeyReader para leer la frase
        System.out.println("Ingrese una vocal: ");
        String vocal = KeyReader.cadenaFlujoEntrada(); // Usar KeyReader para leer la vocal
        
        System.out.println("Frase: " + frase);
        System.out.println("Vocal: " + vocal);

        if (vocal.length() == 1 && "aeiouAEIOU".contains(vocal)) {
            frase = frase.replace(vocal.toLowerCase(), " ").replace(vocal.toUpperCase(), " ");
        }
        
        System.out.println("Frase resultante: " + frase);
    }

    public void Cadenacaracteres09Ac() {
        /*
         * Ingresa una frase y convertir una letra a mayúsculas y otra a minúsculas
         * Ejemplo, frase : di mi nombre
         * salida : Di Mi NoMbRe
         */
        System.out.println("Ingrese una frase: ");
        String frase = KeyReader.cadenaFlujoEntrada();  // Usar KeyReader para leer la frase
        char[] caracteres = frase.toCharArray();
        boolean convertirMayuscula = true;

        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];

            if (c != ' ') { 
                if (convertirMayuscula) {
                    caracteres[i] = Character.toUpperCase(c);
                } else {
                    caracteres[i] = Character.toLowerCase(c);
                }
                convertirMayuscula = !convertirMayuscula; 
            }
        }
        String resultado = new String(caracteres);
        System.out.println("Resultado: " + resultado);
    }
}
