package serieNumerica;

public class ArroyoJuan {

    private int size;

    public ArroyoJuan() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Serie de Fibbonacci, la sumatoria de los dos ultimos
     * numeros genera el siguiente numero.
     * El usuario ingresa el tamanyo, size, y se genera una
     * serie con el maximo de repeticiones que el usuario
     * desee.
     * 
     * @param size
     */
    public void jaS1() {
        System.out.print("S1: ");
        for (int i = 0; i < size; i++) {
            System.out.print(fibbonacci(i) + " ");
        }

    }

    public int fibbonacci(int i) {
        if (i <= 1) {
            return i;
        }
        int result, a = 0, b = 1;

        for (int j = 2; j <= i; j++) {
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
    public void jaS7() {
        int aux = 1;
        System.out.print("S7: ");
        for (int i = 0; i < size; i++) {
            System.out.print(aux + " ");
            aux += 3;
        }
    }

}
