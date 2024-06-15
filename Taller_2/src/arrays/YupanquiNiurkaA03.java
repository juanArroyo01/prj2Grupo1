package arrays;
import java.util.Scanner;

public class YupanquiNiurkaA03 {

    public void SeriearrayA3(Scanner sc) {
        System.out.println("Array 3: ");
        System.out.print("Ingrese su nombre: ");
        String name = sc.next();

        int size = name.length() * 2;

        char plano[][] = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                plano[i][j] = ' ';
            }
        }

        for (int x = 0; x <= size && x < name.length(); x++) {
            char c = name.charAt(x);
            int y = (int) (2 * x);
            if (y < size) {
                plano[x][y] = c;
            }
        }

        for (int i = 6; i >= 0; i--) {
            System.out.print(i + "|");
            for (int j = 0; j < size; j++) {
                System.out.print(plano[i][j]);
            }
            System.out.println();
        }

        System.out.print("  ");
        for (int i = 0; i < size; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
