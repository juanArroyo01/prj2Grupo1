package recursividad;

public class BenavidesJakeRe {
    
    /**
     * Conteo regresivo de un numero ingresado por el usuario
     * imprimiendo los numero de forma decendente hasta lleagar
     * a 0
     * 
     * @param num
     */

    public void jbR06(int num) {
        if (num < 0) {
            return;  
        }
        System.out.println(num);  
        jbR06(num - 1);
    } 
}
