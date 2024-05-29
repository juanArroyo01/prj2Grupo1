
import Utils.FlujoEntrada;
import figuras.BenavidesJakeSf;
import figuras.CasaAntonelafig;
import figuras.CasaFernandoSf;
import figuras.YupanquiNiurkaSf;
import serieCaracteres.BenavidesJakeSc;
import serieCaracteres.CasaAntonelasc;
import serieCaracteres.CasaFernandoSc;
import serieCaracteres.YupanquiNiurkaSc;
import serieNumerica.ArroyoJuan;
import serieNumerica.BenavidesJakeSn;
import serieNumerica.CasaAntonelasn;
import serieNumerica.CasaFernandoSn;
import serieNumerica.YupanquiNiurkaSn;
import serieNumerica.ChimarroMarlon;

public class App {
        static FlujoEntrada fEntrada = new FlujoEntrada();

        public static void main(String[] args) throws Exception {

                ArroyoJuan jaSn = new ArroyoJuan();
                serieCaracteres.ArroyoJuan jaSc = new serieCaracteres.ArroyoJuan();
                figuras.ArroyoJuan jaf = new figuras.ArroyoJuan();

                ChimarroMarlon cmSn5 = new ChimarroMarlon();
                serieCaracteres.ChimarroMarlon mcsc = new serieCaracteres.ChimarroMarlon();
                figuras.ChimarroMarlon mcf = new figuras.ChimarroMarlon();

                YupanquiNiurkaSn ynsn = new YupanquiNiurkaSn();
                YupanquiNiurkaSc ynsc = new YupanquiNiurkaSc();
                YupanquiNiurkaSf ynsf = new YupanquiNiurkaSf();

                CasaFernandoSn cssn = new CasaFernandoSn();
                CasaFernandoSc cssc = new CasaFernandoSc();
                CasaFernandoSf cssf = new CasaFernandoSf();

                BenavidesJakeSn jbsn = new BenavidesJakeSn();
                BenavidesJakeSc jbsc = new BenavidesJakeSc();
                BenavidesJakeSf jbsf = new BenavidesJakeSf();

                CasaAntonelasn acsn = new CasaAntonelasn();
                CasaAntonelasc acsc = new CasaAntonelasc();
                CasaAntonelafig acfig = new CasaAntonelafig();

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

                System.out.println("\nSerie 2");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jbsn.jbSn2(fEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 3");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                acsn.setSize(fEntrada.numeroFlujoEntrada());
                acsn.caSn3();

                System.out.println("\nSerie 4");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                cssn.csSn4(fEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 5");
                cmSn5.setSize(fEntrada.numeroFlujoEntrada());
                cmSn5.mcSn();

                System.out.println("\nSerie 6");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                ynsn.ForynSn6(fEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 7");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jaSn.setSize(fEntrada.numeroFlujoEntrada());
                jaSn.jaS7();

                System.out.println("\nSerie 8");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jbsn.jbSn8(fEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 9");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                acsn.setSize(fEntrada.numeroFlujoEntrada());
                acsn.caSn9();

                System.out.println("\nSerie 10");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                cssn.csSn10(fEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 12");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                ynsn.ForynSn12(fEntrada.numeroFlujoEntrada());

                // ------------------------------------------------------------------------
                System.out.println("\n----------------------------------------------------------\n");

                System.out.println("\nSeries caracteres:");

                System.out.println("Serie 1");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jaSc.jaSc1(fEntrada.numeroFlujoEntrada(), fEntrada.caracterFlujoEntrada());

                System.out.println("\nSerie 2");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jbsc.jbSc2(fEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 3");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                acsc.caSc3(fEntrada.numeroFlujoEntrada());

                System.out.println("Serie 4");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                cssc.csSc4(fEntrada.caracterFlujoEntrada(), fEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 5");
                mcsc.setSize(fEntrada.numeroFlujoEntrada());
                mcsc.mcSc5();

                System.out.println("\nSerie 6");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                ynsc.ForynSc6(fEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 7");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jaSc.setSize(fEntrada.numeroFlujoEntrada());
                jaSc.jaSc7();

                System.out.println("\nSerie 8");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jbsc.jbSc8(fEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 9");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                acsc.caSc9(fEntrada.numeroFlujoEntrada());

                // ------------------------------------------------------------------------

                System.out.println("\n----------------------------------------------------------\n");

                System.out.println("\nFiguras:");

                System.out.println("\nFigura 1");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                cssf.csF1(fEntrada.caracterFlujoEntrada(), fEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 2");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                mcf.mcf2(fEntrada.numeroFlujoEntrada(), fEntrada.caracterFlujoEntrada());

                System.out.println("\nFigura 3");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                ynsf.ForynSf3(fEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 4");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jaf.jaF4(fEntrada.numeroFlujoEntrada(), fEntrada.caracterFlujoEntrada());

                System.out.println("\nFigura 5");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jbsf.jbSf5(fEntrada.caracterFlujoEntrada(), fEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 6");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                acfig.caF6(fEntrada.numeroFlujoEntrada(), fEntrada.caracterFlujoEntrada());

                System.out.println("\nFigura 7");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jaf.jaF7(fEntrada.numeroFlujoEntrada(), fEntrada.caracterFlujoEntrada());

                System.out.println("\nFigura 8");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jbsf.jbSf8(fEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 9");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                acfig.caF9(fEntrada.numeroFlujoEntrada(), fEntrada.caracterFlujoEntrada());

                System.out.println("\nFigura 10");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                cssf.csF10(fEntrada.caracterFlujoEntrada(), fEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 11");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                mcf.mcf11(fEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 12");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                cssf.csF12(fEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 13");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                mcf.mcf13(fEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 14");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                ynsf.ForynSf14(fEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 15");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jaf.jaf15(fEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 16");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jbsf.jbSf16(fEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 17");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                acfig.caF17(fEntrada.numeroFlujoEntrada(), fEntrada.caracterFlujoEntrada());

                System.out.println("\nFigura 18");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                cssf.csF18(fEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 19");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                ynsf.ForynSf19(fEntrada.numeroFlujoEntrada());

        }

}
