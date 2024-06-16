package recursividad;

import Utils.DataReader.KeyReader;

public class CasaAntonela {
    public void Recursividad01Ac() {
        // crear un método recursivo para obtener factorial(n)
        System.out.print("Ingrese un número para calcular su factorial: ");
        int num = KeyReader.numeroFlujoEntrada();  // Usar KeyReader para leer el número
        long factorial = calcularFactorial(num);
        System.out.println("El factorial de " + num + " es: " + factorial);
    }

    private long calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        if (n <= 1) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }
}
