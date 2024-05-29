/***
 * @autor: Niurka Yupanqui
 * @version: 1.0
 * Serie numerica 6 y 12 utilizando for 
 */
package serieNumerica;

public class YupanquiNiurkaSn {
    /**
     * 
     * @param size indica el tamano de la serie para sn6
     */
    public void ForynSn6(int size) {
        for (int number = 1; number <= size; ++number) {
            System.out.print(number * number + " ");
        }

        System.out.println();
    }

    /**
     * 
     * @param size indica el tamano de la serie para sn12
     */
    public void ForynSn12(int size) {
        for (int number = 1; number <= size; number++) {
            System.out.print(number * (number + 1) + " ");
        }
        System.out.println();
    }

}