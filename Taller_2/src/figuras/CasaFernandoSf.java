package figuras;
/**
 * @author: FernandoCasa
 * @version: 1.0
 * Figuras 1 -10-12-18
 */
public class CasaFernandoSf {
    private int tam;
    public CasaFernandoSf(){
    }

    public int getTam(){
        return tam;
    }

    public void setTam(int tam){
        this.tam=tam ;
    }
    /**
     * Permite el ingreso de un caracter y un tamaño
     * esto para generar el marco de un cuadrado.
     * @param carac
     * @param tam
     */
    public void csF1(char carac, int tam) {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if ((i == 0 || i == tam - 1) || (j == 0 || j == tam - 1)) {
                    System.out.print(carac);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }
    /**
     * Permite el ingreso de un caracter y un entero 
     * los cuales nos sirven de parametro para 
     * generar una escalera
     * @param carac
     * @param tam
     */
    public void csF10(char carac, int tam) {
        for (int i = 0; i < tam; i++) {

            for (int j = 0; j < tam; j++) {
                if (i == j) {
                    System.out.print("_+_");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();

            for (int j = 0; j < tam; j++) {
                if (i == j) {
                    System.out.print("   " + carac);
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    /**
     * Permite el ingreso de un entero
     * para poder definir el tamaño de 
     * la piramide inversa.
     * 
     * @param tam
     */
    public void csF12(int tam) {
        for (int i = tam; i >= 1; i--) {

            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            // Move to the next line
            System.out.println();
        }
        System.out.println();

    }
    /**
     * Permite el ingreso de un entero para definir
     * el tamaño de la figura a construir.
     * 
     * @param tam
     */
    public void csF18( int tam) {
        int[][] triangulo = new int[tam][];

        for (int i = 0; i < tam; i++) {
            triangulo[i] = new int[i + 1];
            triangulo[i][0] = 1;
            triangulo[i][i] = 2;

            for (int j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }

        for (int[] fila : triangulo) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

    }




}
