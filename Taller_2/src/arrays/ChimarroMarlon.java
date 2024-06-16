package arrays;
public class ChimarroMarlon {
    /**
     * Autor Marlon Chimarro
     * Crear una matriz solicitando el tamaño y caracter para almacenar las iniciales de su nombre y apellido y presentar la matriz en nuestro caso MC
     * 
     * @param tamano Tamaño de matriz
     * @param caracter Caracter del que va a estar hecho el dibujo
     */
    public void cma02(int tamano, char caracter) {
        int ancho = (tamano * 2) + 1;  // Ancho de la matriz
        char[][] matriz = new char[tamano][ancho];

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < ancho; j++) {
                // Condiciones para dibujar "M"
                if (j == 0 || j == tamano - 1 || (i == j && j < tamano / 2) || (i + j == tamano - 1 && j >= tamano / 2)) {
                    matriz[i][j] = caracter;
                }
                // Condiciones para dibujar "C"
                else if (j == tamano + 1 || (j > tamano + 1 && (i == 0 || i == tamano - 1)) || (j == tamano + 1 && i != 0 && i != tamano - 1)) {
                    matriz[i][j] = caracter;
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }
        mostrarMatrizFigura(matriz);
    }

    private void mostrarMatrizFigura(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}



