package loadings;

public class BenavidesJakeLo {

    /**
     * Genera una barra de carga con el simbolo
     * <=> que va de izquierrda a derecha 
     * 
     */
    
    public void jbL06(){
        int caracteres = 20;
        int total = 100;
        for (int step = 0; step <= total; step++) {
            int progress = caracteres * step / total;
            StringBuilder bar = new StringBuilder(" ".repeat(caracteres));

            if (progress >= 3) {
                bar.replace(progress - 3, progress, "<=>");
            } else {
                bar.replace(0, 3, "<=>");
            }

            System.out.print("\r[" + bar + "] " + step + "%");
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {}
        }
    }


    /**
     * Genera una barra de carga con una figura que va de 
     * hacia la derecha y regresa
     * @param num
     */

    
    public void jbL12(int num) {
        
        for (int i = 0; i < num; i++) {
            espacio(i);
            System.out.println("   \\|||/");
            espacio(i);
            System.out.println("   (> <)");
            espacio(i);
            System.out.println("ooO-(_)-Ooo");
            
            // Mover el cursor hacia arriba (simulado en Java)
            for (int k = 0; k < 3; k++) {
                System.out.print("\033[1A");
            }
            try {
                Thread.sleep(30); 
            } catch (Exception e) {
    
            }
        }
        
        
        for (int i = num - 1; i >= 0; i--) {

            espacio(i);
            System.out.println("   \\|||/ ");
            espacio(i);
            System.out.println("   (> <) ");
            espacio(i);
            System.out.println("ooO-(_)-Ooo ");
            
            // Mover el cursor hacia arriba (simulado en Java)
            for (int k = 0; k < 3; k++) {
                System.out.print("\033[1A");
            }
            try {
                Thread.sleep(30); 
            } catch (Exception e) {
            
            }
        }
        
        System.out.println("\n\n\n"); // Nuevas líneas al final
    }

    static void espacio(int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(" ");
        }
    }

}
