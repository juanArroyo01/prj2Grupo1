package figuras;
/**
 * @author: Jake Benavides
 * @version: 1.0
 * Serie de figuras sf5, sf8 y sf16 mediente el uso de bulces for
 */

public class BenavidesJakeSf {
    
    /**
     * Figura de triangulo invertido donde 
     * el usuario ingresa el tamaño (niveles de la piramide)
     * y el caracter con el que quiere que se quiere 
     * imprimir
     * 
     * @param size
     * @param symb
     */

    public void jbSf5( char symb, int size){

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < size * 2 - 1 - 2 * i; k++) {
                System.out.print(symb);
            }
            System.out.println();
        }
    }   

    /**
     * Esta serie imprime una estecie de escalera donde el 
     * usuario eligira un tamaño (numero de escalones tomando enn cuenta |) 
     * que desee
     * 
     * @param size
     */

    public void jbSf8(int size){
        int aux = (size*2-2);
        String symb = "-";
        String tripleSymb = symb + symb + symb;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < aux; j++) {
                System.out.print(" ");
            }
            if (i%2==0) {
                System.out.println(tripleSymb);
                aux-=1;
            }
            else{
                System.out.println("|");
                aux = aux - 3;
            }
        }
    }

    /**
     * Figura en forma de x con caracteres que se van
     * intercalando
     * El usuario ingresara el tamanio que desee para la figura
     * 
     * @param size
     */

     public void jbSf16(int size){

        if (size % 2 == 0){
            size = size - 1;
        }

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if ((i == j || i + j == size + 1)) {
                    if (i % 2 == 0) {
                        System.out.print(" " + '-' + " ");
                    } else {
                        System.out.print(" " + '+' + " ");
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
