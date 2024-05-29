package serieCaracteres;
/**
 * @author: Chimarro Marlon
 * @version: 1.0
 * Serie de caracteres 5 
 */
public class ChimarroMarlon {
    int size;
    public ChimarroMarlon(){
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size=size;
    }
    /**
     * Serie de caracteres 5
     * El usuario ingresa el tamaño de la serie 
     * La serie a repetirse es "\ | / - | \ | / - ..."
     * @param size es el tamaño de la serie
     */
    public void mcSc5(){
        String[] serie = {"\\", "|", "/", "-", "|"};
        int tam = serie.length;
        for(int i=0 ; i<size ; i++){
            System.out.print(serie[i % tam] + " ");
        }
        System.out.println();
    }

    
}
