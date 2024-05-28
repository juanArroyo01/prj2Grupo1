package serieNumerica;
/**
 * @author: Marlon Chimarro
 * @version: 1.0
 * Serie numerica 5 
 */

public class ChimarroMarlon {

    private int size;

    public ChimarroMarlon(){
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size=size;
    } 
    /**
     * Serie de numeros primos
     * La serie de numeros primos son numeros que son divisibles para 
     * la unidad y para si mismos.
     * El usuario ingresa el tamaño de la serie mediante la variable. 
     * 
     * @param size 
     */
    public void mcSn(){
        System.out.print("SN5: ");
        int mcprimo = 2;
        int mcprimos = 0;
        while (mcprimos<size) {
            if (mcesprimo(mcprimo)) {
                System.out.print(mcprimo + " ");
                mcprimos++;
            }
            mcprimo++;
        }
    }
    public static boolean mcesprimo(int mcprimo){
        if (mcprimo<=1) {
            return false;
        }
        for(int j=2; j <= Math.sqrt(mcprimo); j++){
            if (mcprimo%j==0) {
                return false;
            }
        }
        return true;
    }
}
