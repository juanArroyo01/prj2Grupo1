package cadenaCaracteres;

import Utils.DataReader.KeyReader;

public class CasaFernandoCar {
    /**
     * permite ingresa una frase y una letra 
     * para luego devolver la frase pero con la letra 
     * ingresada eliminada 
     */
    public void scC04() {

        String frase = " Frase  " ;
         char letra ;
        System.out.print("\n Igrese su frase  ");
        frase = KeyReader.cadenaFlujoEntrada();
        System.out.println("su Frase es " + frase);
        letra = KeyReader.caracterFlujoEntrada();
        System.out.println("su letra es " + letra);

        frase = frase.replace(Character.toString(letra), " ");
        System.out.println(frase);
        System.out.println();
    }
    
}
