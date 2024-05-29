package serieCaracteres;

public class CasaAntonelasc {
    public void caSc3(int numero) {
        int cacontador = 0;
        int canum = 2; 
        int caprimoactual = 2; 

        while (cacontador< numero) {
            // Verificar si el número actual es primo
            boolean esPrimo = true;
            for (int i = 2; i <= canum / 2; i++) { // Sin usar Math.sqrt
                if (canum % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            if (esPrimo) {
                // Imprimir el número primo con '+'
                for (int i = 0; i < caprimoactual; i++) {
                    System.out.print("+");
                }
                System.out.print(" ");
                cacontador++;
            }
            
            // Mover al siguiente número
            canum++;
            caprimoactual++;
        }
        System.out.println();
    }

    

    public void caSc9(int numero) {
        if (numero <= 0) return;
    
        char currentChar = 'a'; // Inicia con 'a'
        int prev1 = 1; // Cantidad para 'a'
        int prev2 = 1; // Cantidad para 'b'
        int currentCount;
    
        System.out.print("S7: ");
    
        for (int i = 0; i < numero; i++) {
            if (i < 3) {
                // Imprime 'a', 'b', 'c' una sola vez
                currentCount = 1;
            } else {
                // Para los demás, suma los dos términos anteriores
                currentCount = prev1 + prev2;
                prev1 = prev2;
                prev2 = currentCount;
            }
    
            // Imprime el carácter actual 'currentCount' veces
            for (int j = 0; j < currentCount; j++) {
                System.out.print(currentChar);
            }
    
            // Espacio entre caracteres, excepto después del último
            if (i < numero - 1) {
                System.out.print(" ");
            }
    
            // Incrementa el carácter actual
            currentChar++;
        }
    
        System.out.println(); // Nueva línea al final
    }
    
}
