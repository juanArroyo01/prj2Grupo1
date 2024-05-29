package exceptions;

import java.util.Random;

public class CharException extends Exception {
    String aux;
    char symb;

    public CharException(String message) {
        super(message);
    }

    public CharException(String message, String aux) {
        super(message);
        this.aux = aux;
    }

    public CharException(String message, char symb) {
        super(message);
        this.symb = symb;
    }

    public char getCharInString() {
        return aux.charAt(new Random().nextInt(aux.length()));
    }

}