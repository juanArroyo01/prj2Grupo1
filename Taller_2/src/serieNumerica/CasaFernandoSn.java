package serieNumerica;
/**
 * @author: FernandoCasa
 * @version: 1.0
 * Series Numericas 4 y 10 
 */
public class CasaFernandoSn {
    private int tam;
    public CasaFernandoSn(){
    }

    public int getTam(){
        return tam;
    }

    public void setTam(int tam){
        this.tam=tam ;
    }
/**
 * permite ingresar un tamaño 
 * para poder definir la longitud 
 * de una serie numerica ya definida 
 * 
 * @param tam
 */
    public void csSn4(int tam) {

        int Csaux = 0, Csaux2 = 1;
        int Csaux3 = 2;
        for (int CS = 0; CS < tam; CS++) {
            System.out.print(Csaux + "/" + Csaux3 + ",");
            int next = Csaux + Csaux2;
            Csaux = Csaux2;
            Csaux2 = next;
            Csaux3 = Csaux3 + 2;
        }
        System.out.println();
    }
    /**
     *  permite ingresar un tamaño 
     * para poder definir la longitud 
     * de una serie numerica ya definida 
     * @param tam
     */
    public void csSn10(int tam) {
        int aux = 3;
        for (int i = 0; i < tam; i++) {
            System.out.print(aux + ",");
            aux *= 3;
        }
        System.out.println();
    }
}
