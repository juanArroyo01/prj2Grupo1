package serieNumerica;

public class ArroyoJuan {

    /**
     * Serie de Fibbonacci, la sumatoria de los dos ultimos
     * numeros genera el siguiente numero.
     * El usuario ingresa el tamanyo, size, y se genera una
     * serie con el maximo de repeticiones que el usuario
     * desee.
     * 
     * @param size
     */

    public void jaS1(int size) {
        System.out.print("S1: ");
        for (int i = 0; i < size; i++) {
            System.out.print(fibbonacci(i) + " ");
        }

    }

    public int fibbonacci(int size) {
        if (size <= 1) {
            return size;
        }
        int result, a = 0, b = 1;

        for (int i = 2; i <= size; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return b;
    }

    /**
     * Serie simple con un incremento de 3. El usuario ingresa
     * el tamanyo, size, y se genera una serie con el maximo de
     * repeticiones que el usuario desee.
     * 
     * @param size
     */
    public void jaS7(int size) {
        int aux = 1;
        System.out.print("S7: ");
        for (int i = 0; i < size; i++) {
            System.out.print(aux + " ");
            aux += 3;
        }
    }

}
