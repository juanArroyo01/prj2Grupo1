package loadings;

import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import Utils.DataReader.KeyReader;

public class ArroyoJuan {
    final Integer widthLoading = 20;

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
        int level;
        level = askLevel();
        Integer[] lengthHyphen = new Integer[level];
        for (int i = 0; i < lengthHyphen.length; i++) {
            lengthHyphen[i] = new Random().nextInt(9) + 1;
        }

        System.out.println(Arrays.toString(lengthHyphen));

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
