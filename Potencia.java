public class Potencia {
    public static int potencia (int n, int e) {
        if (e > 1)
            return (n * potencia(n, --e));
        else
            return (n);
    }
}
