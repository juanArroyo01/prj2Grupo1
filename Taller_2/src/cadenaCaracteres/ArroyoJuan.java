package cadenaCaracteres;

public class ArroyoJuan {

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
