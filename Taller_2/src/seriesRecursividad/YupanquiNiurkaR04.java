package seriesRecursividad;
import java.util.Scanner;

public class YupanquiNiurkaR04 {
    public class Recursion4 {
        Scanner sc = new Scanner(System.in);

        public void SerieRecursividadR04() {
            System.out.println("Calcular valor");
            System.out.print("Ingrese la base: ");
            int base = sc.nextInt();
            System.out.print("Ingrese el exponente: ");
            int exponente = sc.nextInt();
            System.out.println("Resultado: " + calcularPotencia(base, exponente));
        }

        public int calcularPotencia(int base, int exponente) {
            int resultado = 1;
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            return resultado;
        }
    }
}
  
   


