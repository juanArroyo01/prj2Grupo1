package serieCaracteres;

/**
 * @author: Jake Benavides
 * @version: 1.0
 * Serie numerica sc2 y sc8 mediente el uso de bulces for
 */
 
public class BenavidesJakeSc {

    /*+
     * Serie de fibonacci pero en vez de imprimir numeros
     * se imprime los caracteres
     * Serie en donde el proximo numero es la suma de
     * los dos anteriores numeros
     * El ususario ingresara el caracter con el que 
     * se quiere frormar la serie y el tamanio que 
     * sera el numero de veces que la serie se repetira
     * 
     * @param size
     */

     public void jbSc2(int size){

        String x = "+" ;
        String y = "";

        for (int j = 0; j <= size; j++) {
            String h = x + y;
            x = y;
            y = h;
            if (j != 0){ 
                System.out.print(x + ' ');
            }
            else{
                System.out.println(x + ' ');
            }
        }

    }

    /**
     * Serie de letras que se imprimen segun continua 
     * una serie de nueros impares
     * El usuario ingresara el tamanio que 
     * sera el numero de veces que la serie se repetira
     * 
     * @param size
     */

    
    public void jbSc8(int size){

        for (int count = 0; count < size; count++) {
            char letra = (char) ('a' + count % 26);
            for (int i = 1; i <= 2 * (count) + 1; i++) {
                System.out.print(letra);
            }
            System.out.print(" ");
        }

    }
}
