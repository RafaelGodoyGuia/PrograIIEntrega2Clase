public class SumaPares {
    public static int sumaPares (int desde, int hasta, int suma) {
        if (desde % 2 != 0)
            desde++;
        if (hasta >= desde)
            return (sumaPares(desde + 2, hasta, suma + desde));
        else
            return (suma);
    }
}
