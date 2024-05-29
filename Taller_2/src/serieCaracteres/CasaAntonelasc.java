package serieCaracteres;

public class CasaAntonelasc {
   
    /*
     * sc3: ++ +++ +++++ +++++++ +++++++++++ +++++++++++++ ...
     * Numeros primos, pero en lugar de imprimir
     * numeros se imprime el caracter "+".
     * 
     */
    public void caSc3(int size) {
        int cacontador = 0;
        int canum = 2; 
        int caprimoactual = 2; 

        while (cacontador< size) {
            
            boolean esPrimo = true;
            for (int i = 2; i <= canum / 2; i++) { 
                if (canum % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            if (esPrimo) {
                
                for (int i = 0; i < caprimoactual; i++) {
                    System.out.print("+");
                }
                System.out.print(" ");
                cacontador++;
            }
            
            canum++;
            caprimoactual++;
        }
        System.out.println();
    }

    /*
     * sc9: a b c dd eee fffff gggggggg ...
     * Serie de Fibonacci con el abecedario
     */

    public void caSc9(int size) {
        if (size <= 0) return;
    
        char acactualChar = 'a'; 
        int acprev1 = 1; 
        int acprev2 = 1; 
        int accontador;
    
        System.out.print("S7: ");
    
        for (int i = 0; i < size; i++) {
            if (i < 3) {
                
                accontador = 1;
            } else {
                
                accontador = acprev1 + acprev2;
                acprev1 = acprev2;
                acprev2 = accontador;
            }
    
            for (int j = 0; j < accontador; j++) {
                System.out.print(acactualChar);
            }
    
            if (i < size - 1) {
                System.out.print(" ");
            }
    
            acactualChar++;
        }
    
        System.out.println(); 
    }
    
}
