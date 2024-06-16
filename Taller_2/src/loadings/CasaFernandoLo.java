package loadings;

import Utils.DataReader.KeyReader;

public class CasaFernandoLo {
    /**
     * Permite el ingreso de un caracter 
     * para generar una barra de carga 
     * junto al porcentaje al final 
     */
    public void scLo2() {
        char caracter = KeyReader.caracterFlujoEntrada();
        String aux = Character.toString(caracter);

        final Integer maxbarra = 20;
        for (int i = 0; i <= maxbarra; i++) {
            System.out.print("\r[" + aux.repeat(i) + "]" + i * 10 / 2 + "%" + " ".repeat(maxbarra - i));
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
/**
 * Permite el ingreso de un nombre y apellido 
 * para que con este podamos ir generando una b
 * barra de carga.
 */
    public void scLo8() {

        System.out.print("\n Ingrese su nombre y apellido  ");
        String name = KeyReader.cadenaFlujoEntrada();
        int longitudNombre = name.length();

        char[] barraProgreso = new char[longitudNombre];
        for (int i = 0; i < longitudNombre; i++) {
            barraProgreso[i] = ' ';
        }

        for (int i = 0; i < longitudNombre; i++) {
            barraProgreso[i] = name.charAt(i);
            int progreso = (int) (((double) (i + 1) / longitudNombre) * 100);
            System.out.print("[");
            System.out.print(barraProgreso);
            System.out.print("] " + progreso + "%\r");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Pausa para simular la carga
        }
        System.out.print("[");
        System.out.print(barraProgreso);
        System.out.println("] 100%");
        System.out.println();
    }

}
