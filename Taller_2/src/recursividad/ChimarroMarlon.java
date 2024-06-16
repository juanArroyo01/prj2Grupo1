package recursividad;
/**
 * Autor Marlon Chimarro
 * @param a entero numero 1
 * @param b entero numero 2
 */
public class ChimarroMarlon {
// Método recursivo para realizar la multiplicación de dos números
    public int cmmr(Integer c, Integer d) {
        // Caso base: cuando b es 0, la multiplicación es 0
        if (d == 0) {
            return 0;
        }
        // Caso recursivo: a * b = a + (a * (b - 1))
        return (c + cmmr(c, d - 1));
    }
    public void mrmr(int c, int d) {
        Integer resultado = cmmr(c, d);
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
