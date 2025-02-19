import java.util.ArrayList;

public class SumaParesLista {
    public static int sumaParesLista(ArrayList<Integer> lista, int suma, int index) {
        if (index < lista.size()) {
            if (lista.get(index) % 2 == 0)
                suma += lista.get(index);
            return (sumaParesLista(lista, suma, ++index));
        }
        else
            return (suma);
    }
}
