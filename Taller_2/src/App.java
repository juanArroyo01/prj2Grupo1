
import Utils.FlujoEntrada;
import figuras.*;
import serieCaracteres.*;
import serieNumerica.ArroyoJuan;
import serieNumerica.*;

public class App {
        public static void main(String[] args) throws Exception {

                // Objects
                ArroyoJuan jaSn = new ArroyoJuan();
                serieCaracteres.ArroyoJuan jaSc = new serieCaracteres.ArroyoJuan();
                figuras.ArroyoJuan jaf = new figuras.ArroyoJuan();
                cadenaCaracteres.ArroyoJuan jacc = new cadenaCaracteres.ArroyoJuan();

                serieNumerica.ChimarroMarlon cmSn5 = new serieNumerica.ChimarroMarlon();
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

                // Variable
                int aux;
                String cadena;

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
                jaSn.setSize(FlujoEntrada.numeroFlujoEntrada());
                jaSn.jaS1();

                System.out.println("\nSerie 2");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jbsn.jbSn2(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 3");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                acsn.setSize(FlujoEntrada.numeroFlujoEntrada());
                acsn.caSn3();

                System.out.println("\nSerie 4");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                cssn.csSn4(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 5");
                cmSn5.setSize(FlujoEntrada.numeroFlujoEntrada());
                cmSn5.mcSn();

                System.out.println("\nSerie 6");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                ynsn.ForynSn6(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 7");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jaSn.setSize(FlujoEntrada.numeroFlujoEntrada());
                jaSn.jaS7();

                System.out.println("\nSerie 8");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jbsn.jbSn8(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 9");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                acsn.setSize(FlujoEntrada.numeroFlujoEntrada());
                acsn.caSn9();

                System.out.println("\nSerie 10");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                cssn.csSn10(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 12");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                ynsn.ForynSn12(FlujoEntrada.numeroFlujoEntrada());

                // ------------------------------------------------------------------------
                System.out.println("\n----------------------------------------------------------\n");

                System.out.println("\nSeries caracteres:");

                System.out.println("Serie 1");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jaSc.jaSc1(FlujoEntrada.numeroFlujoEntrada(), FlujoEntrada.caracterFlujoEntrada());

                System.out.println("\nSerie 2");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jbsc.jbSc2(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 3");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                acsc.caSc3(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("Serie 4");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                cssc.csSc4(FlujoEntrada.caracterFlujoEntrada(), FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 5");
                mcsc.setSize(FlujoEntrada.numeroFlujoEntrada());
                mcsc.mcSc5();

                System.out.println("\nSerie 6");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                ynsc.ForynSc6(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 7");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jaSc.setSize(FlujoEntrada.numeroFlujoEntrada());
                jaSc.jaSc7();

                System.out.println("\nSerie 8");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jbsc.jbSc8(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nSerie 9");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                acsc.caSc9(FlujoEntrada.numeroFlujoEntrada());

                // ------------------------------------------------------------------------

                System.out.println("\n----------------------------------------------------------\n");

                System.out.println("\nFiguras:");

                System.out.println("\nFigura 1");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                cssf.csF1(FlujoEntrada.caracterFlujoEntrada(), FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 2");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                mcf.mcf2(FlujoEntrada.numeroFlujoEntrada(), FlujoEntrada.caracterFlujoEntrada());

                System.out.println("\nFigura 3");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                ynsf.ForynSf3(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 4");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jaf.jaF4(FlujoEntrada.numeroFlujoEntrada(), FlujoEntrada.caracterFlujoEntrada());

                System.out.println("\nFigura 5");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jbsf.jbSf5(FlujoEntrada.caracterFlujoEntrada(), FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 6");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                acfig.caF6(FlujoEntrada.numeroFlujoEntrada(), FlujoEntrada.caracterFlujoEntrada());

                System.out.println("\nFigura 7");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jaf.jaF7(FlujoEntrada.numeroFlujoEntrada(), FlujoEntrada.caracterFlujoEntrada());

                System.out.println("\nFigura 8");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jbsf.jbSf8(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 9");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                acfig.caF9(FlujoEntrada.numeroFlujoEntrada(), FlujoEntrada.caracterFlujoEntrada());

                System.out.println("\nFigura 10");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                cssf.csF10(FlujoEntrada.caracterFlujoEntrada(), FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 11");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                mcf.mcf11(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 12");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                cssf.csF12(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 13");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                mcf.mcf13(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 14");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                ynsf.ForynSf14(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 15");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jaf.jaf15(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 16");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jbsf.jbSf16(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 17");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                acfig.caF17(FlujoEntrada.numeroFlujoEntrada(), FlujoEntrada.caracterFlujoEntrada());

                System.out.println("\nFigura 18");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                cssf.csF18(FlujoEntrada.numeroFlujoEntrada());

                System.out.println("\nFigura 19");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                ynsf.ForynSf19(FlujoEntrada.numeroFlujoEntrada());

                // ------------------------------------------------------------------------

                System.out.println("\n----------------------------------------------------------\n");

                System.out.println("\nCadena de caracteres:");

                System.out.println("\nCadena 1");
                System.out.println("\nIngrese la frase que desee verificar.");
                aux = jacc.jaC01(FlujoEntrada.cadenaFlujoEntrada());
                if (aux != -1)
                        System.out.println("Salida: tiene " + aux + " vocales.");
                else
                        System.out.println("Salida: tiene " + 0 + " vocales.");

                System.out.println("\nCadena 7");
                System.out.println("\nIngrese la frase que desee poner en mayusculas.");
                cadena = jacc.jaC07(FlujoEntrada.cadenaFlujoEntrada());
                System.out.println("Salida: " + cadena);
        }

}
