package cadenaCaracteres;

import Utils.DataReader.KeyReader;

public class YupanquiNiurkaC06 {
    public void serieCadenaCaracterC06() {
        System.out.print("Ingrese una frase: ");
<<<<<<< HEAD
        String frase = KeyReader.cadenaFlujoEntrada();
        
=======
        String frase = sc.nextLine();

>>>>>>> 41d96ee41c720525efae2bcc563b70e54ed6acbd
        String fraseMayusculas = frase.toUpperCase();
        String fraseInvertida = "";

        for (int i = fraseMayusculas.length() - 1; i >= 0; i--) {
            fraseInvertida += fraseMayusculas.charAt(i);
        }

        System.out.println("Resultado: " + fraseInvertida);
    }
}
