package arrays ;

import Utils.DataReader.KeyReader;

public class CasaFernandoAry {
    /**
     * Crea una array para cada palabra de su nombre y
     *  permite ingresar el porcentaje de carga para cada palabra.
     */
    public void csA01() {
        System.out.print("\n Ingrese su nombre:");
        String nombre = KeyReader.cadenaFlujoEntrada();
        System.out.print("\n Ingrese el porcentaje de carga para cada palabra:");
        String[] porString = KeyReader.getKeyboard().nextLine().split(" ");
        int[] porcentajes = new int[porString.length];
    
        for (int i = 0; i < porString.length; i++) {
            porcentajes[i] = Integer.parseInt(porString[i]);
        }
    
        String[] palabras = nombre.split(" ");
    
        for (int i = 0; i < palabras.length; i++) {
            int carga = porcentajes[i];
            StringBuilder barraCarga = new StringBuilder("[");
            int llenado = carga / 10;
            for (int j = 0; j < llenado; j++) {
                barraCarga.append("=");
            }
            barraCarga.append(">"); 
            for (int j = llenado; j < 10; j++) {
                barraCarga.append(" ");
            }
            barraCarga.append("] ");
            System.out.printf("%s %d%% %s\n", barraCarga.toString(), carga, palabras[i]);
        }
        System.out.println();
    }
    
}
