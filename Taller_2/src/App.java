import Utils.FlujoEntrada;
import figuras.YupanquiNiurkaSf;
import serieCaracteres.YupanquiNiurkaSc;
import serieNumerica.ArroyoJuan;
import serieNumerica.YupanquiNiurkaSn;

public class App {
    static FlujoEntrada fEntrada = new FlujoEntrada();

    public static void main(String[] args) throws Exception {

        ArroyoJuan jaSn = new ArroyoJuan();
        serieCaracteres.ArroyoJuan jaSc = new serieCaracteres.ArroyoJuan();
        figuras.ArroyoJuan jaf = new figuras.ArroyoJuan();

        YupanquiNiurkaSn ynsn = new YupanquiNiurkaSn();
        YupanquiNiurkaSc ynsc = new YupanquiNiurkaSc();
        YupanquiNiurkaSf ynsf = new YupanquiNiurkaSf();

        System.out.println("Grupo 1 \nIntegrantes:");
        System.out.println("arroyo.juan");
        System.out.println("benavides.jake");
        System.out.println("casa.fernando");
        System.out.println("casa.antonela");
        System.out.println("chimarro.marlon");
        System.out.println("yupanqui.niurka");

        System.out.println("\n\t---> Taller 2 <---");
        System.out.println("Series numericas:");

        System.out.println("\nSerie 1");
        jaSn.setSize(fEntrada.numeroFlujoEntrada());
        jaSn.jaS1();

        System.out.println("\nSerie 6");
        System.out.println("\nIngrese el tamaño que desee de la serie.");
        ynsn.ForynSn6(fEntrada.numeroFlujoEntrada());

        System.out.println("\nSerie 7");
        System.out.println("\nIngrese el tamaño que desee de la serie.");
        jaSn.setSize(fEntrada.numeroFlujoEntrada());
        jaSn.jaS7();

        System.out.println("\nSerie 12");
        System.out.println("\nIngrese el tamaño que desee de la serie.");
        ynsn.ForynSn12(fEntrada.numeroFlujoEntrada());

        // ------------------------------------------------------------------------
        System.out.println("\n----------------------------------------------------------\n");

        System.out.println("\nSeries caracteres:");

        System.out.println("Serie 1");
        System.out.println("\nIngrese el tamaño que desee de la serie.");
        jaSc.jaSc1(fEntrada.numeroFlujoEntrada(), fEntrada.caracterFlujoEntrada());

        System.out.println("\nSerie 6");
        System.out.println("\n\nIngrese el tamaño que desee de la serie.");
        ynsc.ForynSc6(fEntrada.numeroFlujoEntrada());

        System.out.println("\nSerie 7");
        System.out.println("\n\nIngrese el tamaño que desee de la serie.");
        jaSc.setSize(fEntrada.numeroFlujoEntrada());
        jaSc.jaSc7();

        // ------------------------------------------------------------------------

        System.out.println("\n----------------------------------------------------------\n");

        System.out.println("\nFiguras:");

        System.out.println("\nFigura 4");
        System.out.println("\nIngrese el tamaño que desee de la serie.");
        ynsf.ForynSf3(fEntrada.numeroFlujoEntrada());

        System.out.println("\nFigura 4");
        System.out.println("\nIngrese el tamaño que desee de la serie.");
        jaf.jaF4(fEntrada.numeroFlujoEntrada(), fEntrada.caracterFlujoEntrada());

        System.out.println("\nFigura 7");
        System.out.println("\n\nIngrese el tamaño que desee de la serie.");
        jaf.jaF7(fEntrada.numeroFlujoEntrada());

        System.out.println("\nFigura 14");
        System.out.println("\n\nIngrese el tamaño que desee de la serie.");
        ynsf.ForynSf14(fEntrada.numeroFlujoEntrada());

        System.out.println("\nFigura 15");
        System.out.println("\n\nIngrese el tamaño que desee de la serie.");
        jaf.jaf15(fEntrada.numeroFlujoEntrada());

        System.out.println("\nFigura 15");
        System.out.println("\n\nIngrese el tamaño que desee de la serie.");
        ynsf.ForynSf19(fEntrada.numeroFlujoEntrada());

    }

}
