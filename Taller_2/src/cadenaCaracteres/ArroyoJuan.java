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
}
