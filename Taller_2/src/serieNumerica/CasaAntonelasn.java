package serieNumerica;

public class CasaAntonelasn {
    private int size;

    public CasaAntonelasn() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    // sn3: 0/1  1/3  1/5  2/7  3/9  5/11  8/13  13/15 ...
    /*
     * Fracciones con la serie de Fibbonacci en el numerador
     * y numeros impares en el denominador
     * 
     */

    public void caSn3(){
        int cax=-1, cay=1 , caz=1, caimpares= 1;
        for(int i=0; i<size; i++){
            caz= cax+cay;
            System.out.print(caz+ "/"+ caimpares +"   " );
            cax=cay;
            cay=caz;
            caimpares= caimpares+2;

        }
        System.out.println();
    }

    // sn9: 2, 4, 8, 16, 32, 64, 128, 256 ...
    /*
     * números que se duplican en cada término
     * 
     */
    

    public void caSn9(){
        int caProducto=2;
        for(int i=0; i<size; i++){
            System.out.print(caProducto +",  " );
            caProducto= caProducto * 2;
           
        }

    }
}
