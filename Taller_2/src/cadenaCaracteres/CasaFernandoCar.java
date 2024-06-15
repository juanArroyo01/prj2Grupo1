package cadenaCaracteres;

import Utils.DataReader.KeyReader;

public class CasaFernandoCar {
    public void scC04() {

        String frase = " Frase  " ;
         char letra ;
        System.out.print("\n Igrese su frace  --> ");
        frase = KeyReader.cadenaFlujoEntrada();
        System.out.println("su Frase es " + frase);
        System.out.print("\n Igrese  una letra --> ");
        letra = KeyReader.caracterFlujoEntrada();
        System.out.println("su letra es " + letra);

        frase = frase.replace(Character.toString(letra), " ");
        System.out.println(frase);
        System.out.println();
    }
    
}
