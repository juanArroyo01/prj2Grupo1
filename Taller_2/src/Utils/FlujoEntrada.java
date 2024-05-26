package Utils;

import java.util.Scanner;

import exception.NegativeNumbers;

public class FlujoEntrada {
    private Scanner keyboard = new Scanner(System.in);

    public int numeroFlujoEntrada() {
        int num;
        try {
            System.out.print("-> ");
            if (!keyboard.hasNextInt()) {
                keyboard.next();
                throw new NumberFormatException(
                        "\nHa ingresado un texto o simbolo, ingrese un valor numerico positivo.\n");
            } else {
                num = keyboard.nextInt();
                if (num < 0) {
                    throw new NegativeNumbers(
                            "\n*** Ha ingresado un numero negativo. Se corrigio a numero positivo. ***\n",
                            num);
                }
                return num;
            }
        } catch (NegativeNumbers e) {
            System.out.println(e.getMessage());
            return e.getCorrectNumber();
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return numeroFlujoEntrada();
        }
    }
}
