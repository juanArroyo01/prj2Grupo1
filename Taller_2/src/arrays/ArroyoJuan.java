package arrays;

public class ArroyoJuan {

    /**
     * 
     * @param name
     * @param surname
     */
    public void jaA04(String name, String surname) {
        int length = (name.length() > surname.length()) ? name.length() : surname.length();
        char nameArray[] = name.toCharArray(), surnameArray[] = surname.toCharArray();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j)
                    System.out.print(nameArray[j]);
                else
                    System.out.print("  ");

            }
            System.out.println();
        }

    }

}
