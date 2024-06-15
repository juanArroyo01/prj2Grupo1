package cadenaCaracteres;

public class ArroyoJuan {

    /**
     * Realiza el conteo de las vocales en
     * una cadena de texto ingresado, se
     * recepta la cadena de texto por parametro
     * y se analiza sus datos.
     * 
     * En el caso que el usuario no ingresase una
     * vocal, se retorna -1, caso contrario el valor
     * de las vocales.
     * 
     * @param phrase
     * @return
     */
    public int jaC01(String phrase) {
        int count = 0;
        System.out.println("Frase: " + phrase);
        for (char aux : phrase.toCharArray()) {
            if (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u') {
                count++;
            }
        }
        if (count != 0) {
            return count;
        } else {
            return -1;
        }
    }

    /**
     * Convierte de minuscula a mayuscula con la condicion 
     * que la j y J desaparezca dentro de la cadena de texto.
     * 
     * @param phrase
     * @return
     */
    public String jaC07(String phrase) {
        int count = 0;
        char newPhrase[] = new char[phrase.length()];
        System.out.println("Frase: " + phrase);
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) != 'j' && phrase.charAt(i) != 'J') {
                newPhrase[count++] = Character.toUpperCase(phrase.charAt(i));
            }
        }
        return String.valueOf(newPhrase);
    }

}
