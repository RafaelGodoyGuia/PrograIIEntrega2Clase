public class DesviacionTipica {
    public static double desviacionTipica(List<Double> numeros) {
        int n = numeros.size();
        if (n == 0) {
            return 0.0;
        }
        double[] sumatorios = calcularSumatorios(numeros, 0, 0.0, 0.0);
        double suma = sumatorios[0];
        double sumaCuadrados = sumatorios[1];
        double media = suma / n;
        double varianza = (sumaCuadrados / n) - (media * media);
        return Math.sqrt(varianza);
    }

    private static double[] calcularSumatorios(List<Double> numeros, int indice, double sumaActual, double sumaCuadradosActual) {
        if (indice == numeros.size()) {
            return new double[]{sumaActual, sumaCuadradosActual};
        }
        double numero = numeros.get(indice);
        return calcularSumatorios(numeros, indice + 1, sumaActual + numero, sumaCuadradosActual + numero * numero);
    }
}
