import Utils.FlujoEntrada;

public class App {

    public static void main(String[] args) throws Exception {
        FlujoEntrada fEntrada = new FlujoEntrada();

        int size;

        System.out.println("Grupo 1 \n Integrantes:");
        System.out.println("arroyo.juan");
        System.out.println("benavides.jake");
        System.out.println("casa.fernando");
        System.out.println("casa.antonela");
        System.out.println("chimarro.marlon");
        System.out.println("yupanqui.niurka");

        System.out.println("\n\t---> Taller 2 <---");

        System.out.println("Ingresa el numero de repeticiones.");
        size = fEntrada.numeroFlujoEntrada();

        System.out.println("Numero de repeticiones: " + size);

        System.out.println();

    }
}
