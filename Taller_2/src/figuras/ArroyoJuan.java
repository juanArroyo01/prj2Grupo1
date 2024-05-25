package figuras;

public class ArroyoJuan {

    /**
     * Figura triangular con caracteres.
     * El usuario ingresa tamanyo y caracter,
     * se genera una figura a partir de los parametros
     * pasados.
     * 
     * @param size
     * @param symb
     */
    public void jaF4(int size, char symb) {
        for (int i = 0; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(symb + " ");
            }
            System.out.println();
        }
    }

    public void jaF7(int size) {
        int aux = 4;
        for (int i = 0; i < size; i++) {
            System.out.print("___\n");
            for (int j = 0; j < aux; j++) {
                System.out.print(" ");
            }
            aux += 4;
            System.out.print('|');
        }
    }

}
