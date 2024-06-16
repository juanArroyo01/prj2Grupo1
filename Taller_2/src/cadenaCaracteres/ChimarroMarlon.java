package cadenaCaracteres;

public class ChimarroMarlon {
    /**
     * Autor Marlon Chimarro
     * Cadena de caracteres 5
     * Invierte una frase o palabra y cambia sus vocales por mayúsculas 
     * 
     * @param phrase palabra a ser invertida y cuyas vocales serán hechas mayusculas.
     */

    public void cmcc05(String phrase) {
        StringBuilder palabraInvertida = new StringBuilder();
        for (int i = phrase.length() - 1; i >= 0; i--) {
            char c = phrase.charAt(i);
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                palabraInvertida.append(Character.toUpperCase(c));
            } else {
                palabraInvertida.append(c);
            }
        }
        System.out.println("Palabra invertida: " + palabraInvertida);
    }
}
