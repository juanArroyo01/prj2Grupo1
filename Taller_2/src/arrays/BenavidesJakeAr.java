package arrays;

import java.util.Random;

public class BenavidesJakeAr {

    /**
     * Genera un matriz cuadrada dependiendo del los nombre ingresados
     * la matriz se llena aleatoriamente y se repite una misma casilla se
     * pone un *
     * @param name
     */
    
    public void jbA05(String name) {
        Random random = new Random();
        int size = name.length();
        char[][] matrix = new char[size][size];

        // Llenar la matriz con espacios en blanco inicialmente
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = ' ';
            }
        }

        // Colocar letras aleatorias del nombre
        for (int i = 0; i < size; i++) {
            int j = random.nextInt(size); // Posición aleatoria en la fila
            while (matrix[i][j] != ' ') {
                j = random.nextInt(size); // Buscar otra posición si ya está ocupada
            }
            matrix[i][j] = getRandomLetter(name, random);
        }

        // Colocar espacios aleatorios en posiciones distintas a las ocupadas por letras
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == ' ') {
                    matrix[i][j] = getRandomSpaceOrStar(random);
                }
            }
        }

        // Imprimir la matriz con delay para efecto visual
        System.out.println("\nMatriz con letras y espacios/asteriscos aleatorios:\n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" " + matrix[i][j] + " ");
                try {
                    Thread.sleep(50); // Delay de 50 milisegundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static char getRandomLetter(String name, Random random) {
        // Obtener una letra aleatoria del nombre
        int index = random.nextInt(name.length());
        return name.charAt(index);
    }

    public static char getRandomSpaceOrStar(Random random) {
        // Obtener un espacio, asterisco o letra aleatoria del nombre
        String characters = " *";
        return characters.charAt(random.nextInt(characters.length()));
    }
}
