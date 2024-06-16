package loadings;

public class ChimarroMarlon {
    /**
     * Autor Marlon Chimarro
     * 
     * @param symb es el char que utilizaremos para el loading, va de izq a derecha y en nu movimiento completo carga un 20% y asi sucesivamente
     */
    public void cml03(char symb) throws InterruptedException {
        int length = 20; // Longitud de la barra
        int position = 0; // Posición inicial del carácter
        boolean forward = true; // Dirección inicial (hacia adelante)
        int porcentaje = 0; // Porcentaje de carga

        while (porcentaje <= 100) {
            // Imprimir la barra
            System.out.print("\r[");
            for (int i = 0; i < length; i++) {
                if (i == position) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%");

            // Pausa
            Thread.sleep(100);

            // Cambiar la posición
            if (forward) {
                position++;
                if (position == length - 1) {
                    forward = false;
                }
            } else {
                position--;
                if (position == 0) {
                    forward = true;
                    porcentaje += 20; // Incrementar el porcentaje cada vez que regrese al inicio
                }
            }
        }
        System.out.println("\nCarga completa!");
    }

    /**
     * Autor Marlon Chimarro
     * 
     * @param nombrecompleto es el string del nombre que se mostrara para la carga en una sola linea hasta el 100%
     */
    public void cml09(String nombreCompleto) {
        int longitud = nombreCompleto.length();

        for (int i = 0; i < longitud; i++) {
            int porcentaje = ((i + 1) * 100) / longitud;

            System.out.print("[");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print(nombreCompleto.charAt(i));

            // Espacios adicionales para ajustar dinámicamente la longitud de la barra de carga
            for (int k = i + 1; k < longitud; k++) {
                System.out.print(" ");
            }

            System.out.print("] " + porcentaje + "%");

            // Limpiar la línea anterior en la consola
            System.out.print("\r");

            try {
                // Pausa para simular la animación
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(); // Salto de línea al final
    }
}
