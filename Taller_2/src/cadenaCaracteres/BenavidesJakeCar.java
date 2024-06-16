package cadenaCaracteres;
import java.util.Scanner;

public class BenavidesJakeCar {

    /**
    * Se contabilizan las letras que el usuario ingrese 
    * y si en el caso de que el usurio no ingrese una palabra
    * el programa devolvera la frase "Por favor ingrese un dato válido"
    *
    * @param frase
    * @return
    */

    public void jbC02(){
        int contador = 0;
        String frase;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        frase = sc.nextLine();
        for (int i = 0; i < frase.length(); i++) {
        char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)) { 
                contador++;
            }
        }
     
        if (contador != 0){ 
            System.out.print("La cantidad de letras que hay en la palabra son: " + contador);
        }
        else {
            System.out.print("Por favor ingrese un dato válido");
        }
        sc.close();
    }

    /**
    * Muestra la palabra de un conjunto y solicita que
    * se ingrese el anagrama de esa palabra, si es el correcto
    * el usuario pasara al siguiente nive, de lo contraio solo 
    * tendra 3 intentos para adivinar
    * 
    */

    public void jbC08(){
        String[] palabras = {"lacteo", "lobo", "vocal", "animales", "barco"};
        String[] anagramas = {"coleta", "bolo", "calvo", "milanesa", "cobra"};
        String palabra, anagrama, respuesta;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Intente adivinar el anagrama");

        for (int i = 0; i < palabras.length; i++) {
            palabra = palabras[i];
            anagrama = anagramas[i];
            System.out.println("Adivine el anagrama de: " + palabra);

            boolean ok = false;
            for (int j = 1; j <= 3; j++) {
                respuesta = sc.nextLine();

                if (respuesta.equals(anagrama)) {
                    System.out.println(":D Felicidades ha adivinado el anagrama de: " + palabra);
                    ok = true;
                    break;
                } else {
                    System.out.println(":( No es correcto, intente de nuevo");
                }
            }
            if (!ok) {
                System.out.println("Ya ha usado los 3 intentos, el anagrama de la palabra " + palabra + " es " + anagrama);
            }
            if (i < palabras.length - 1) {
                System.out.println("Siguiente nivel");
            }
        }
        sc.close();
    }             
}
