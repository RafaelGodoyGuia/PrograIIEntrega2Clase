
import java.util.ArrayList;

public class Main {
    public static void main (String[] argv) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(6);
        System.out.println(SumaParesLista.sumaParesLista(lista, 0, 0));
    }
}
