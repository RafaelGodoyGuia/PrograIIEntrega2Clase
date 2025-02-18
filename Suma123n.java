public class Suma123n {
    //Inicializar suma a 0 y n con el número hasta el que se quiere sumar
    public static int suma123n (int suma, int n) {
        if (n > 0)
            return (suma123n(suma + n, n-1 ));
        else
            return (suma);
    }
}
