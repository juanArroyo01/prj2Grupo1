package recursividad;

import Utils.DataReader.KeyReader;

public class CasaFernandoRe {
    /**
     * nos permite ingresar dos enteros 
     * para realizar una suma recursiva 
     * con ellos. 
     * 
     */

    public void scR02() {
        int a, b;
     
        a = KeyReader.numeroFlujoEntrada();
        
        b = KeyReader.numeroFlujoEntrada();
        int resultado = sumaRecursiva(a, b);
        System.out.println("El resultado de la suma es " + resultado);

    }
/**
 * este metodo nos ayuda a poder realizar una 
 * suma recursiva
 * @param a
 * @param b
 * @return
 */
    public int sumaRecursiva(int a, int b) {
        if (b == 0)
            return a;
        else
            return 1 + sumaRecursiva(a, b - 1);

    }

}
