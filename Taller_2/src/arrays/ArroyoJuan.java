package arrays;

public class ArroyoJuan {

    /**
     * Imprime el nombre y el apellido en una 
     * figura equis. El usuario ingresa los 
     * datos, nombre y apellido, y el metodo
     * analiza la longitud de la figura equis.
     * 
     * @param name
     * @param surname
     */
    public void jaA04(String name, String surname) {
        int length = (name.length() > surname.length()) ? name.length() : surname.length(), count;
        char nameArray[] = name.toCharArray(), surnameArray[] = surname.toCharArray();

        count = surname.length() - 1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j && j < name.length())
                    System.out.print(nameArray[j]);
                else if ((j == (length - i) - 1) && (count >= 0))
                    System.out.print(surnameArray[(surname.length() - 1) - count--]);
                else
                    System.out.print("   ");

            }
            System.out.println();
        }

    }

}
