package loadings;

import java.util.concurrent.TimeUnit;

public class CasaAntonela {
    public void Loading01Ac() {
        /* Indicador de carga desde 0  a 100% usar los signos \|/-| para simular 
            un movimiento rotacional de carga 0% hasta 100%  / 100%
        */ 
        char[] animacion = { '\\', '|', '/', '-' };

        for (int i = 0; i <= 100; i++) {
            int index = i % animacion.length;

            String carga = String.format("Cargando %d%% %c", i, animacion[index]);

            int longitudLineaAnterior = carga.length();
            StringBuilder espacios = new StringBuilder();
            for (int j = 0; j < longitudLineaAnterior; j++) {
                espacios.append(' ');
            }

            System.out.print(carga + "\r" + espacios.toString());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Carga completada!");
    }
    public void Loading07Ac() {
        /*
         * Crear una barra es de 20 caracteres, la barra avanza cambiando
         * la punta con movimiento rotacional signos \|/-|
         */
        char[] animacion = { '\\', '|', '/', '-' };
        int longitudBarra = 20;
        for (int i = 0; i <= 100; i++) {
            int index = i % animacion.length;

            // Calcular la cantidad de '=' para la barra de progreso
            int cantidadIgual = (i * longitudBarra) / 100;
            StringBuilder barra = new StringBuilder();
            for (int j = 0; j < cantidadIgual; j++) {
                barra.append('=');
            }

            // Agregar el carácter rotacional en la posición adecuada
            if (cantidadIgual < longitudBarra) {
                barra.append(animacion[index]);
                cantidadIgual++; // Incrementar para reflejar el carácter animado añadido
            }

            // Espacios restantes en la barra
            for (int j = cantidadIgual; j < longitudBarra; j++) {
                barra.append(' ');
            }

            // Crear la línea de carga con porcentaje
            String carga = String.format("[%s] %d%%", barra.toString(), i);

            // Imprimir y sobrescribir la línea anterior
            System.out.print("\r" + carga);
            System.out.print("                              "); // Agregar espacios para sobrescribir cualquier residuo

            try {
                TimeUnit.MILLISECONDS.sleep(100); // Espera 100 milisegundos entre cada actualización
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Imprimir una nueva línea al finalizar
        System.out.println();
    }
}
