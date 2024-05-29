package serieNumerica;
/**
 * @author: Jake Benavides
 * @version: 1.0
 * Serie numerica sn2 y sn8 mediente el uso de bulces for
 */

public class BenavidesJakeSn {
    private int size;

    public BenavidesJakeSn() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // sn2 = 1 0 3 0 5 0 7 0 9 ...
    /**
     * Serie de numeros impares separadas con un 0
     * El usuario ingresara el tamanio con el que se 
     * generara la serie, mostrando el numero de datos 
     * de la serie (numeros impares) dependiendo del numero
     * ingresado por el usuario.
     * 
     * @param size
     */

    public void jbSn2(int size){

        for (int i = 1; i <= (size*2-1); i++){
            if (i % 2 != 0){
                System.out.print(i);
            }
            else if (i == 1){
                System.out.print(i);
            }
            else if (i % 2 == 0) {
                System.out.print(0);
            }
            System.out.print(" ");  
        }
    }

    //sn8 = 3 8 13 18 23 28 32 38 ...
    /**
     * Serie simple donde esta empieza en 3 y se suma 5
     * sucesivamente (en cada iteracion)
     * El usuario ingresara el tamanio deseado para el 
     * numero de iteraciones que desee (numero de terminos 
     * de la serie que quiere que se muestre)
     * 
     * @param size 
     */

    public void jbSn8(int size){
        int j = 3;
        for (int i = 0; i < size; i++) {
            System.out.print(j + " ");
            j = j + 5;
        }

    }
    
}
