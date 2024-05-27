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

    /**
     * Figura escalonar con caracteres.
     * El usuario ingresa tamanyo, se genera una
     * figura a partir de los parametros pasados.
     * 
     * @param size
     */
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
        System.out.println();
    }

    /**
     * Triangulo de Pascal.
     * El usuario ingresa el size del triangulo,
     * se genera el triangulo a partir de los
     * parametros pasados.
     * 
     * @param size
     */
    public void jaf15(int size) {
        int aux;
        for (int i = 0; i < size; i++) {
            aux = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(aux + "  ");
                aux = aux * (i - j) / (j + 1);
            }
            System.out.println();
        }
        System.out.println();
    }

}
