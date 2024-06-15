/**
 * @autor: Niurka Yupanqui
 * @version: 1.0
 * Serie con caracter utilizando for
 */

 package serieCaracteres;

 public class YupanquiNiurkaSc {
 /**
  * 
  * @param size indica el tamano de la serie 
  */
     public void ForynSc6(int size) {
         char[] letras = {'a', 'c', 'e', 'g', 'i', 'l', 'n', 'p', 'r', 't', 'v', 'x', 'z'};
           
         String simbolo = "";
 
         for (int number = 0; number < size; number++) {
             if (number >= letras.length) {
                 break;  
             }
             if (number % 2 == 0) {
                 if (number > 0) {
                     simbolo += "+";
                 }
                 simbolo += letras[number];
             } else {
                 simbolo += "-";
                 simbolo += letras[number];
             }
         }
         System.out.println(simbolo);
     }
 
     }
 
 