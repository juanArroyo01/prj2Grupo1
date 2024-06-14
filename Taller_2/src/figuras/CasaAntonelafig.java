package figuras;

public class CasaAntonelafig {
    /*
     * Figura 6: piramide hacia arriba formada
     * con el caracter que ingrese el usuario y el 
     * tamaño que el mismo lo decida
     */
    public void caF6(int size, char symb){
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size-i; j++) {
 
              System.out.print(" ");
              
            }
            for (int k= 1; k <= 2*i-1; k++) {
             System.out.print(symb);
             
            }
            System.out.println(" ");
         }
     
        
    }

    /*
     * Figura 9: escales de subida y bajada formada por 
     * el caracter que ingrese el usuario y un caracter fijo "|" 
     */
    

    public void caF9(int size, char symb) {
        String catripleSymb = "" + symb + symb + symb;
        int aux = (size * 2 - 2); 

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < aux; j++) {
            System.out.print(" ");
            }

            if (i % 2 == 0) {
            // Imprimir tripleSymb en las filas pares
            System.out.print(catripleSymb);
                if (i > 0) {
                // Imprimir espacios intermedios
                    for (int j = 0; j < 4 * i - 3; j++) {
                    System.out.print(" ");
                    }
                    System.out.println(catripleSymb);
                } else {
                System.out.println();
                }
                aux -= 1;
            } else {
            // Imprimir | en las filas impares
            System.out.print("|");
            // Imprimir espacios intermedios
            for (int j = 0; j < 4 * i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
            aux -= 3;
            }
        }
         
    }

    /*
     * Figura 17: X pormada por un caracter que determina 
     * el usuario y uno fijo "0"
     */
    public void caF17(int size, char symb){
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if ((i == j || i + j == size + 1)) {
                    if (i % 2 == 0) {
                        System.out.print(" " + '0' + " ");
                    } else {
                        System.out.print(" " + symb + " ");
                    }
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}