import Utils.FlujoEntrada;

public class App {

    public static void main(String[] args) throws Exception {
        FlujoEntrada fEntrada = new FlujoEntrada();

        int size;

        System.out.println("\t---> Taller 2 <---");

        System.out.println("Ingresa el numero de repeticiones.");
        size = fEntrada.numeroFlujoEntrada();

        System.out.println("Numero de repeticiones: " + size);

        System.out.println("Test");
    }
}
