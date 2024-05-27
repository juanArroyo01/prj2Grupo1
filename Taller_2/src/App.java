import Utils.FlujoEntrada;
import serieNumerica.ArroyoJuan;

public class App {

    public static void main(String[] args) throws Exception {
        FlujoEntrada fEntrada = new FlujoEntrada();
        ArroyoJuan jaSn = new ArroyoJuan();
        serieCaracteres.ArroyoJuan jaSc = new serieCaracteres.ArroyoJuan();


        System.out.println("Grupo 1 \nIntegrantes:");
        System.out.println("arroyo.juan");
        System.out.println("benavides.jake");
        System.out.println("casa.fernando");
        System.out.println("casa.antonela");
        System.out.println("chimarro.marlon");
        System.out.println("yupanqui.niurka");

        System.out.println("\n\t---> Taller 2 <---");

        System.out.println("Series numericas:");
        System.out.println("Serie 1");
        System.out.println("\nIngrese el tamaño que desee de la serie.");
        jaSn.setSize(fEntrada.numeroFlujoEntrada());

        jaSn.jaS1();

        System.out.println("Serie 7");
        System.out.println("\n\nIngrese el tamaño que desee de la serie.");
        jaSn.setSize(fEntrada.numeroFlujoEntrada());

        jaSn.jaS7();

        // ------------------------------------------------------------------------

        System.out.println("Series caracteres:");
        System.out.println("Serie 1");
        System.out.println("\nIngrese el tamaño que desee de la serie.");
        jaSc.setSize(fEntrada.numeroFlujoEntrada());

        jaSc.jaSc1();

        System.out.println("Serie 7");
        System.out.println("\n\nIngrese el tamaño que desee de la serie.");
        jaSc.setSize(fEntrada.numeroFlujoEntrada());

        jaSc.jaSc7();

    }
}
