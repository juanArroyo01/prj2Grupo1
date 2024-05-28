
package serieCaracteres;
/**
 * @author: FernandoCasa
 * @version: 1.0
 * Series caracteres num 4 
 */
public class CasaFernandoSc {
    private int tam;
    public CasaFernandoSc(){
    }

    public int getTam(){
        return tam;
    }

    public void setTam(int tam){
        this.tam=tam ;
    }
/**
 * esta serie permite ingresar un tamaño 
 * y un caracter mientras que los demas 
 * son caracteres ya quemados.
 * @param carac
 * @param tam
 */
    public void csSc4(char carac, int tam) {
        for (int i = 0; i < tam; i++) {
            System.out.print("+ " + "- " + "* " + carac + " ");
        }
        System.out.println(); 
    }
}
