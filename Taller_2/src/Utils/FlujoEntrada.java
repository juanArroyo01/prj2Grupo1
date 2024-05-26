package Utils;

import java.util.Scanner;

import exceptions.NegativeNumbers;

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

}
