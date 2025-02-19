import java.util.ArrayList;

public class MediaLista {
    public static float mediaLista (ArrayList<Integer> lista, int suma, int index) {
        if (index < lista.size())
            return (mediaLista(lista, suma += lista.get(index), ++index));
        else
            return ((float)suma / (float)lista.size());
    }
}
