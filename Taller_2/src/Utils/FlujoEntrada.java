package Utils;

import java.util.Scanner;

import exceptions.*;

public class FlujoEntrada {
    private Scanner keyboard = new Scanner(System.in);

    public int numeroFlujoEntrada() {
        int num;
        try {
            System.out.print("-> ");
            num = Integer.parseInt(keyboard.nextLine());
            if (num < 0) {
                throw new NegativeNumbers(
                        "\n*** Ha ingresado un numero negativo. Se corrigio a numero positivo. ***\n",
                        num);
            }
            return num;

        } catch (NegativeNumbers e) {
            System.out.println(e.getMessage());
            return e.getCorrectNumber();
        } catch (NumberFormatException e) {
            System.out
                    .println("\nHa ingresado un texto, texto vacio o simbolo , ingrese un valor numerico positivo.\n");
            return numeroFlujoEntrada();
        }
    }

    public char caracterFlujoEntrada() {
        String aux = null;
        char symb;
        try {
            System.out.print("-> ");
            aux = keyboard.nextLine();
            if (aux.length() > 1) {
                throw new CharException(
                        "\nHa ingresado un texto. De la cadena del texto, se eligio aleatoriamente un caracter.\n", aux);
            } else if (aux.isEmpty() || aux.isBlank()) {
                throw new CharException("\nHa ingresado un texto vacio. Ingrese nuevamente.\n");
            } else {
                symb = aux.charAt(0);
                if (Character.isWhitespace(symb)) {
                    throw new CharException("\nHa ingresado un espacio en blanco, ingrese nuevamente.\n", symb);
                }
                return symb;
            }
        } catch (CharException e) {
            System.out.println(e.getMessage());
            if (aux.isEmpty() || aux.isBlank()) {
                return caracterFlujoEntrada();
            }
            symb = e.getCharInString();
        return symb;
        }
    }

}
