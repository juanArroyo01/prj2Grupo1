package serieCaracteres;

/**
 * @author: Juan Arroyo
 * @version: 1.0
 * Serie de caracteres 1 y 7 utilizando for
 */
public class ArroyoJuan {

    char symb;
    int size;

    public ArroyoJuan() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char getSymb() {
        return symb;
    }

    public void setSymb(char symb) {
        this.symb = symb;
    }

    /**
     * Serie de caracteres.
     * El usuario ingresa el tamanyo, size, y se genera una
     * serie con el maximo de repeticiones que el usuario
     * desee.
     * 
     * @param size
     */
    public void jaSc1(int size, char symb) {
        System.out.print("S1: ");
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                System.out.print("+ ");
            } else {
                System.out.print(symb + " ");
            }
        }
        System.out.println();
    }

    /**
     * Serie de caracteres.
     * El usuario ingresa el tamanyo, size, y se genera una
     * serie con el maximo de repeticiones que el usuario
     * desee. Se utiliza codigo ASCII para aprovechar el
     * alfabeto completo. Sea el caso que el usario ingrese
     * numeros mayores a 27 (maximo del alfabeto), empezara
     * nuevamente desde la a.
     * 
     * @param size
     */
    public void jaSc7() {
        char vowelAscii = 97, times = 2; // Hasta 122

        System.out.print("S7: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
            for (int j = 0; j < times; j++) {
                System.out.print(vowelAscii);
            }
            if (vowelAscii != 122) {
                vowelAscii++;
            } else {
                vowelAscii = 97;
            }
            times += 2;
        }
        System.out.println();
    }

}
