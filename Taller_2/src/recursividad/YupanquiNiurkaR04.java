package recursividad;


import Utils.DataReader.KeyReader;

public class YupanquiNiurkaR04 {

    public void SerieRecursividadR04() {
        System.out.println("Calcular valor");
        System.out.print("Ingrese la base: ");
        int base = KeyReader.numeroFlujoEntrada();
        System.out.print("Ingrese el exponente: ");
        int exponente = KeyReader.numeroFlujoEntrada();
        System.out.println("Resultado: " + calcularPotencia(base, exponente));
    }

    public int calcularPotencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

}
