import java.util.ArrayList;

public class SumaLista {
    public static int sumaLista (ArrayList<Integer> lista, int index) {
        if (index < lista.size())
            return (lista.get(index) + sumaLista(lista, ++index));
        else
            return (0);
    }
}
