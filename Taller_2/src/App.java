
import Utils.DataReader.KeyReader;
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
                arrays.ArroyoJuan jaa = new arrays.ArroyoJuan();
                loadings.ArroyoJuan jal = new loadings.ArroyoJuan();

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
                jaSn.setSize(KeyReader.numeroFlujoEntrada());
                jaSn.jaS1();

                System.out.println("\nSerie 2");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jbsn.jbSn2(KeyReader.numeroFlujoEntrada());

                System.out.println("\nSerie 3");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                acsn.setSize(KeyReader.numeroFlujoEntrada());
                acsn.caSn3();

                System.out.println("\nSerie 4");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                cssn.csSn4(KeyReader.numeroFlujoEntrada());

                System.out.println("\nSerie 5");
                cmSn5.setSize(KeyReader.numeroFlujoEntrada());
                cmSn5.mcSn();

                System.out.println("\nSerie 6");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                ynsn.ForynSn6(KeyReader.numeroFlujoEntrada());

                System.out.println("\nSerie 7");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jaSn.setSize(KeyReader.numeroFlujoEntrada());
                jaSn.jaS7();

                System.out.println("\nSerie 8");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jbsn.jbSn8(KeyReader.numeroFlujoEntrada());

                System.out.println("\nSerie 9");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                acsn.setSize(KeyReader.numeroFlujoEntrada());
                acsn.caSn9();

                System.out.println("\nSerie 10");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                cssn.csSn10(KeyReader.numeroFlujoEntrada());

                System.out.println("\nSerie 12");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                ynsn.ForynSn12(KeyReader.numeroFlujoEntrada());

                // ------------------------------------------------------------------------
                System.out.println("\n----------------------------------------------------------\n");

                System.out.println("\nSeries caracteres:");

                System.out.println("Serie 1");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jaSc.jaSc1(KeyReader.numeroFlujoEntrada(), KeyReader.caracterFlujoEntrada());

                System.out.println("\nSerie 2");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jbsc.jbSc2(KeyReader.numeroFlujoEntrada());

                System.out.println("\nSerie 3");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                acsc.caSc3(KeyReader.numeroFlujoEntrada());

                System.out.println("Serie 4");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                cssc.csSc4(KeyReader.caracterFlujoEntrada(), KeyReader.numeroFlujoEntrada());

                System.out.println("\nSerie 5");
                mcsc.setSize(KeyReader.numeroFlujoEntrada());
                mcsc.mcSc5();

                System.out.println("\nSerie 6");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                ynsc.ForynSc6(KeyReader.numeroFlujoEntrada());

                System.out.println("\nSerie 7");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jaSc.setSize(KeyReader.numeroFlujoEntrada());
                jaSc.jaSc7();

                System.out.println("\nSerie 8");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jbsc.jbSc8(KeyReader.numeroFlujoEntrada());

                System.out.println("\nSerie 9");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                acsc.caSc9(KeyReader.numeroFlujoEntrada());

                // ------------------------------------------------------------------------

                System.out.println("\n----------------------------------------------------------\n");

                System.out.println("\nFiguras:");

                System.out.println("\nFigura 1");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                cssf.csF1(KeyReader.caracterFlujoEntrada(), KeyReader.numeroFlujoEntrada());

                System.out.println("\nFigura 2");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                mcf.mcf2(KeyReader.numeroFlujoEntrada(), KeyReader.caracterFlujoEntrada());

                System.out.println("\nFigura 3");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                ynsf.ForynSf3(KeyReader.numeroFlujoEntrada());

                System.out.println("\nFigura 4");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jaf.jaF4(KeyReader.numeroFlujoEntrada(), KeyReader.caracterFlujoEntrada());

                System.out.println("\nFigura 5");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                jbsf.jbSf5(KeyReader.caracterFlujoEntrada(), KeyReader.numeroFlujoEntrada());

                System.out.println("\nFigura 6");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                acfig.caF6(KeyReader.numeroFlujoEntrada(), KeyReader.caracterFlujoEntrada());

                System.out.println("\nFigura 7");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jaf.jaF7(KeyReader.numeroFlujoEntrada(), KeyReader.caracterFlujoEntrada());

                System.out.println("\nFigura 8");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jbsf.jbSf8(KeyReader.numeroFlujoEntrada());

                System.out.println("\nFigura 9");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                acfig.caF9(KeyReader.numeroFlujoEntrada(), KeyReader.caracterFlujoEntrada());

                System.out.println("\nFigura 10");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                cssf.csF10(KeyReader.caracterFlujoEntrada(), KeyReader.numeroFlujoEntrada());

                System.out.println("\nFigura 11");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                mcf.mcf11(KeyReader.numeroFlujoEntrada());

                System.out.println("\nFigura 12");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                cssf.csF12(KeyReader.numeroFlujoEntrada());

                System.out.println("\nFigura 13");
                System.out.println("\nIngrese el tamaño que desee de la serie.");
                mcf.mcf13(KeyReader.numeroFlujoEntrada());

                System.out.println("\nFigura 14");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                ynsf.ForynSf14(KeyReader.numeroFlujoEntrada());

                System.out.println("\nFigura 15");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jaf.jaf15(KeyReader.numeroFlujoEntrada());

                System.out.println("\nFigura 16");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                jbsf.jbSf16(KeyReader.numeroFlujoEntrada());

                System.out.println("\nFigura 17");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                acfig.caF17(KeyReader.numeroFlujoEntrada(), KeyReader.caracterFlujoEntrada());

                System.out.println("\nFigura 18");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                cssf.csF18(KeyReader.numeroFlujoEntrada());

                System.out.println("\nFigura 19");
                System.out.println("\n\nIngrese el tamaño que desee de la serie.");
                ynsf.ForynSf19(fEntrada.numeroFlujoEntrada());

                System.out.println("TEST");

<<<<<<< HEAD
=======
                System.out.println("\n----------------------------------------------------------\n");

                System.out.println("\nCadena de caracteres:");

                System.out.println("\nCadena 1");
                System.out.println("\nIngrese la frase que desee verificar.");
                aux = jacc.jaC01(KeyReader.cadenaFlujoEntrada());
                if (aux != -1)
                        System.out.println("Salida: tiene " + aux + " vocales.");
                else
                        System.out.println("Salida: tiene " + 0 + " vocales.");

                System.out.println("\nCadena 7");
                System.out.println("\nIngrese la frase que desee poner en mayusculas.");
                cadena = jacc.jaC07(KeyReader.cadenaFlujoEntrada());
                System.out.println("Salida: " + cadena);

                System.out.println("\n----------------------------------------------------------\n");

                System.out.println("\nCadena de Arrays:");

                System.out.println("\nArrays 4");
                System.out.println("\nIngrese nombre y apellido.");
                jaa.jaA04(KeyReader.cadenaFlujoEntrada(), KeyReader.cadenaFlujoEntrada());

                System.out.println("\n----------------------------------------------------------\n");

                System.out.println("\nLoading:");

                System.out.println("\nLoading 5");
                jal.jaL05();
                
                System.out.println("\nLoading 11");
                jal.jaL11();
>>>>>>> f37b09a97935ae58f1bf96517f85efbf4995fef7
        }

}
