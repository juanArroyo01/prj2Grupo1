package serieNumerica;

public class CasaAntonelasn {
    
    public void caSn3(int numero){
        int cax=-1, cay=1 , caz=1, caimpares= 1;
        for(int i=0; i<numero; i++){
            caz= cax+cay;
            System.out.print(caz+ "/"+ caimpares +"  " );
            cax=cay;
            cay=caz;
            caimpares= caimpares+2;

        }
        System.out.println();
    }
    

    public void caSn9(int numero){
        int caProducto=2;
        for(int i=0; i<numero; i++){
            System.out.print(caProducto +"  " );
            caProducto= caProducto * 2;
           
        }

    }
}
