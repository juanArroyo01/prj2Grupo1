package loadings;

import java.util.Random;

import Utils.DataReader.KeyReader;

public class ArroyoJuan {
    final Integer widthLoading = 20;

    final String RESET = "\033[0m"; // Text Reset
    final String RED = "\033[0;31m"; // RED
    final String GREEN = "\033[0;32m"; // GREEN
    final String YELLOW = "\033[0;33m"; // YELLOW
    final String BLUE = "\033[0;34m"; // BLUE
    final String PURPLE = "\033[0;35m"; // PURPLE
    final String CYAN = "\033[0;36m"; // CYAN
    final String WHITE = "\033[0;37m"; // WHITE

    final String[] colorArray = { RESET, GREEN, YELLOW, BLUE, PURPLE, CYAN, WHITE };

    private String getColor() {
        return colorArray[new Random().nextInt(colorArray.length)];
    }

    /**
     * Imprime una barra de carga con su respectivo
     * porcentaje. El tiempo transcurrido en cada
     * nuevo calor del porcentaje es de 100ms.
     * 
     */
    public void jaL05() {
        System.out.println("Empezando carga...");

        for (int i = 0; i <= widthLoading; i++) {
            System.out.print(
                    "\r".repeat(20) + "[" + "=".repeat(i) + ">" + " ".repeat(widthLoading - i) + "] " + (i * 10) / 2
                            + "%");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void jaL11() {
        int level, maxLenght = 0, spaceLength;
        level = askLevel();
        Integer[] lengthHyphen = new Integer[level];
        for (int i = 0; i < lengthHyphen.length; i++) {
            lengthHyphen[i] = new Random().nextInt(9) + 1; // Genera numeros aleatorios y define el ancho mayor
            maxLenght = (lengthHyphen[i] > maxLenght) ? lengthHyphen[i] : maxLenght;
        }

        for (int i = 0; i < level; i++) {
            spaceLength = maxLenght - lengthHyphen[i];
            System.out.print(getColor() + " ".repeat(spaceLength) + "-".repeat(lengthHyphen[i]));
            System.out.print("|");
            System.out.print("-".repeat(lengthHyphen[i]) + "\n" + RESET);
        }

        System.out.println();

    }

    private Integer askLevel() {
        int level;
        do {
            System.out.println("¿Cuantos niveles desea? Maximo 50");
            level = KeyReader.numeroFlujoEntrada();
            if (level < 0 || level > 50) {
                System.out.println("Ha ingresado un valor fuera del rango, ingrese nuevamente.");
            }
        } while (level < 0 || level > 50);
        return level;
    }
}
