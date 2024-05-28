/*
 * @autor: Niurka Yupanqui
 * @version: 1.0
 * Series de figuras 3, 14 , 19 utilizando for 
 */

 package figuras;

 public class YupanquiNiurkaSf {
  /**
  * 
  * @param size tamano de la figura para figura 3
  */
     public void ForynSf3(int size) {
             for (int fila = 1; fila <= size; fila++) {
                 for (int columna = 1; columna <= fila; columna++) {
                     System.out.print(" * ");
             }
 
             for (int espacio = 1; espacio <= size - fila; espacio++) {
                 System.out.print("   ");
             }
 
             System.out.println();
         }
     }
 
 
     public void ForynSf14(int size) {
   /**
   * 
   * @param size tamano de la figura para figura 14
   */
         for (int fila = 0; fila < size; fila++) {
             int coeficiente = 1;
 
             for (int columna = 0; columna < size - fila; columna++) {
                 System.out.print("  ");
             }
             for (int columna = 0; columna <= fila; columna++) {
                     System.out.printf("%4d", coeficiente);
                     coeficiente = coeficiente * (fila - columna) / (columna + 1);
             }
 
              System.out.println();
         }
     }
 
 
     public void ForynSf19(int size) { 
         /**
          * @param size tamano de la figura para figura 19
          */
         int[] numeros = {3, 4, 5, 5, 9, 7, 6, 14, 16, 9};
         int indice = 0;
 
             for (int fila = 1; fila <= size; fila++) {
                 for (int columna = 1; columna <= fila; columna++) {
                     if (columna == 1) {
                         if (fila == 1) {
                             System.out.print("* ");
                         } else {
                             System.out.print("+ ");
                         }
                     } else if (columna == fila) {
                         System.out.print("* ");
                     } else if (fila >= 2 && columna <= fila) {
                         System.out.print(numeros[indice % numeros.length] + " ");
                         indice++;
                     }
                 }
                 System.out.println();
             }
     }            
 
 }