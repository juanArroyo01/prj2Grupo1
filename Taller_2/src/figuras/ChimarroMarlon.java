package figuras;
/**
 * @author: Chimarro Marlon
 * @version: 1.0
 * Figuras 2, 11 y 13 utilizando for
 */
public class ChimarroMarlon {
    /**
     * Figura 2.
     * Es una figura cuadrangular que tiene 2 caracteres
     * El caracter definido por defecto es +
     * El usuario ingresa tamaño o nivel y caracter,
     * la figura se genera con ambos parametros
     * @param size tamaño o niveles
     * @param symb caracter adicional a parte del seleccionado por defecto
     */
    public void mcf2(int size, char symb){
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    if ((i + j) % 2 == 0) {
                        System.out.print(symb + " ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

        /**
     * Figura 11.
     * Es una figura en forma de escalera que se forma con 2 caracteres
     * Ambos caracteres definidos por defecto son | _ 
     * El usuario ingresa tamaño o nivel
     * @param size tamaño o niveles
     */
    public void mcf11(int size){
        int espacios = 0;
        for(int i = 1; i <= size; i++){
            // Impresion de espacios    
            for(int j = 1; j <= espacios; j++){
                System.out.print("  ");
            }
            // Impresion de la barra con los guiones
            System.out.print("|");
            for(int j = 0;j <= i; j++){
                System.out.print(" _");
            }
            System.out.println();
            // Actualizando cantidad de espacios para la escalera   
            espacios += i+1;
        }
    }

         /**
     * Figura 13.
     * Figura de una sucesion de numeros apegada a la izquierda
     * El usuario ingresa tamaño o niveles de la figura
     * la figura se genera solo con ese tamaño
     * @param size tamaño o niveles
     */
    public void mcf13(int size){
        for(int i=1; i<=size; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
        System.out.println();
        }   
    }
}